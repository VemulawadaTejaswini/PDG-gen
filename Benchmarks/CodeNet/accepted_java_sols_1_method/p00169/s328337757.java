import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String[] sc = stdIn.nextLine().split(" ");
			if(Integer.parseInt(sc[0])==0){
				return;
			}
			int[] card = new int[sc.length];
			for(int i=0;i<sc.length;i++){
				card[i] = Integer.parseInt(sc[i]);
				if(card[i]>10){
					card[i] = 10;
				}
				else if(card[i]==1){
					card[i] = 11;
				}
			}
			int sum = 0;
			int c11 = 0;
			for(int i=0;i<sc.length;i++){
				sum += card[i];
				if(card[i]==11){
					c11++;
				}
			}
			if(sum<=21){
				System.out.println(sum);
			}
			else if(c11<1){
				System.out.println("0");
			}
			else{
				boolean flag = true;
				for(int i=0;i<c11;i++){
					sum -= 10;
					if(sum<=21){
						System.out.println(sum);
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.println("0");
				}
			}
		}
	}
}