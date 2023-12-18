import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length();
		int z=0;
		long y=1,ans=0;
		while(z<N){
			if(S.charAt(z)=='W'){
				ans+=(z+1)-y;
				y++;
			}
			z++;
		}
		System.out.println(ans);
	}
}