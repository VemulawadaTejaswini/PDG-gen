import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		int K=stdIn.nextInt();
		int z=0;
		String a="";
		char s=S.charAt(K-1);
		while(z<N){
			if(S.charAt(z)!=s)
				a+="*";
			else
				a+=s;
			z++;
		}
		System.out.println(a);
	}
}