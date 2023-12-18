import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		int t=0,i,j,count=0;
		int lim;
		int[] x = new int[30];
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			lim = scan.nextInt();
			count = 0;
			if(lim >= 2)count++;
			
			for(i=3;i<=lim;i=i+2){
				for(j=2;j<=lim;j++){
					int k = i % j;
					if(j == i){
						count++;
					}
					if(k == 0)break;
				}
			}
		System.out.println(count);
			x[t] = count;
			t++;
		}
		
		for(int s : x){
			System.out.println(s);
		}
	}
}