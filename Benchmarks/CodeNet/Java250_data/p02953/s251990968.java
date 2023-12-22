import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] p=new int[N];
		for(int i=0; i<N; i++) {
			p[i]=sc.nextInt();
		}
		p[0]--;
		if(N==1) {
			p("Yes");
			System.exit(0);
		}
		else {
			for(int i=1; i<N; i++) {
				if(p[i]>p[i-1]) {
					p[i]--;
				}
				else if(p[i]==p[i-1]) {
					//
				}
				else if(p[i]<p[i-1]) {
					p("No");
					System.exit(0);
				}
			}
			p("Yes");
		}


	}
	public static void p(Object o) {
		System.out.println(o);
	}
}