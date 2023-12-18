import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			Train[] train = new Train[data];
			for(int i=0; i<data; i++){
				train[i] = new Train(sc.next(), sc.next(), i);
			}

			int cnt = 0, j = 0;
			for(int i=0; i<data; i++){
				if(train[i].check){
					train[i].check = false;
					cnt++;
					j = i+1;
					while(j<data){
						if(train[j].check && train[j].leave>=train[i].arrive){
							Train[] temp = Arrays.copyOfRange(train, j, train.length);
							Arrays.sort(temp, new Comparator<Train>(){
								public int compare(Train a, Train b){
									return a.arrive -  b.arrive;
								}
							});
							train[i].arrive = temp[0].arrive;
							train[temp[0].num].check = false;
						}
						j++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	static class Train{
		int leave, arrive, num;
		boolean check;
		Train(String l, String a, int n){
			String[] lv = l.split(":");
			leave = Integer.parseInt(lv[0])*3600 + Integer.parseInt(lv[1])*60 + Integer.parseInt(lv[2]);
			String[] ar = a.split(":");
			arrive = Integer.parseInt(ar[0])*3600 + Integer.parseInt(ar[1])*60 + Integer.parseInt(ar[2]);	
			check = true;
			num = n;
		}
	}
}