import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt();
		int p[]=new int[N];
		for(int i=0;i<N;i++) 
			p[i]=sc.nextInt();
		sc.close();
		boolean result=true;
		for(int i=0;i<=100;i++) {
			result=true;
			for(int j=0;j<N;j++) {
				if(X-i==p[j]) {
					result=false;
				}
			}
			if(result==true) {
				System.out.println(X-i);
				System.exit(0);
			}
			result=true;
			for(int j=0;j<N;j++) {
				if(X+i==p[j]) {
					result=false;
				}
			}
			if(result==true) {
				System.out.println(X+i);
				System.exit(0);
			}
		}	
	}
}