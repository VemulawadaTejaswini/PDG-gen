



import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] an=new int[N];

		for(int i=0; i<N; i++) {
			an[i]=sc.nextInt();
		}
		StringBuilder sb=new StringBuilder();

		if(N%2==0) {
			for(int i=N-1; i>=0; i-=2) {
				sb.append(an[i]);
				sb.append(" ");
			}
			for(int i=0; i<N; i+=2) {
				sb.append(an[i]);
				sb.append(" ");
			}
			String a=new String(sb);
			a=a.substring(0, a.length()-1);
			System.out.println(a);
		}

		if(N%2==1) {
			for(int i=N-1; i>=0; i-=2) {
				sb.append(an[i]);
				sb.append(" ");
			}
			for(int i=1; i<N; i+=2) {
				sb.append(an[i]);
				sb.append(" ");
			}
			String a=new String(sb);
			a=a.substring(0, a.length()-1);
			System.out.println(a);
		}
	}
}