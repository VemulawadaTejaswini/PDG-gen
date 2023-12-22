import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int ans=0;
		S+="Z";

		for(int i=0;i<N;i++) {
			char c1= S.charAt(i);
			char c2=S.charAt(i+1);
			if(c1!=c2) {

				ans++;
			}
		}
		System.out.println(ans);
	}
}