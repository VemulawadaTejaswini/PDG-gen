import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String T=stdIn.next();
		char a[]=new char[T.length()];
		int ans=0;
		for(int i=0;i<T.length();i++){
			a[i]=T.charAt(i);
		}
		for(int i=0;i<T.length();i++){
			if(a[i]=='?')
				if(i!=T.length()-1&&a[i+1]=='D')
					a[i]='P';
				else
					a[i]='D';
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
