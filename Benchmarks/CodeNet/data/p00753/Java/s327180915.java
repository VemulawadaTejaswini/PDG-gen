
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int MAX = 123456;
		int[] sosu = new int[MAX*2+1];
		for(int i = 0;i<=MAX*2;i++ ){
			sosu[i]=1;
		}
		int j=0;
		for(int i=2; i<= MAX; i++){
			 if(sosu[i] == 0) continue;

			 j = i+i;
			 while(j <= 2*MAX){
				 sosu[j] = 0;
				 j += i;
			 }
		}
		while(true){
			int n=0,p=0;
			n = scan.nextInt();
			if(n==0)
				break;

			for(int i = n+1;i <= n*2;i++){
				p+=sosu[i];
			}
			System.out.println(p);
		}
	}
}

