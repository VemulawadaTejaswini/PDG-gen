import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		String ans="";
		for(int i=0;i<S.length();i++){
			int a=S.charAt(i)-'A';
			a+=N;
			if(a>25)
				a-=26;
			ans+=(char)(a+'A');
		}
		System.out.println(ans);
	}
}
