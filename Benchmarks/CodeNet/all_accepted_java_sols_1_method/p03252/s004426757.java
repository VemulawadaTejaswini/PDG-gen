import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String S=sc.next();
		String T=sc.next();
		boolean same = true;

		char s[]=S.toCharArray();
		char t[]=T.toCharArray();

		for (int i=0;i<S.length()&&same==true;++i){
			if(S.indexOf(s[i],i+1)==T.indexOf(t[i],i+1));
			else same=false;
		}

		if (same== true)System.out.println("Yes");
		else System.out.println("No");


//		System.out.println(S.indexOf(s[2], 3));
	}
}