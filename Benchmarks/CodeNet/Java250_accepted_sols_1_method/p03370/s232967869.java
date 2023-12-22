import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int x=scan.nextInt();

		int w=x;
		int s=0;

		int m[]=new int[n];

		for(int i=0;i<n;i++) {
			m[i]=scan.nextInt();
			w-=m[i];
			if(i==0||s>m[i]) {
				s=m[i];
			}
		}

		System.out.println(n+(int)(Math.floor(w/s)));
	}
}
