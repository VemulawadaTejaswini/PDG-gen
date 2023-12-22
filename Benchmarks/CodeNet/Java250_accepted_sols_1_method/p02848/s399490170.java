import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		String ans="";
		for(int i=0;i<S.length();i++){
			char b=S.charAt(i);
			int a=(int)(b-'A')+N;
			if(a>25)
				a-=26;
			b=(char)(a+'A');
			ans+=String.valueOf(b);
		}
		System.out.println(ans);
	}
}
