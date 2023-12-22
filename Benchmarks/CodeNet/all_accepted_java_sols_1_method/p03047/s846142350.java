import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int count=0;
		for(int i=1;i<=N-K+1;i++) {
			if(i+K-1>N) {
				break;
			}else {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
		
}