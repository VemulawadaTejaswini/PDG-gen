import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int D = sc.nextInt();
			int cnt = 0;
			for(int i=0;i<N;++i) {
				long x = sc.nextInt();
				long y = sc.nextInt();
				double sum = Math.sqrt(x*x+y*y);
				if(sum<=D) {
					cnt++;
				}				
			}
			
			System.out.println(cnt);
	}	
}