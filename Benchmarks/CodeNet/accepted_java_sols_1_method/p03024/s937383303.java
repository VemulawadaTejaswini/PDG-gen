import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int z=0,ans=0;
		while(z<S.length()){
			if(S.charAt(z)=='x')
				ans++;
			z++;
		}
		if(ans>7)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}