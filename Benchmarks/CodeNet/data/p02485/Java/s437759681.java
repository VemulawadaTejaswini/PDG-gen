import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,m;
		for(;;){
			int S=0;
		String a =sc.next();
		if(a.equals("0")){
				break;
		}
		int n=a.length();
		for(i=0;i<n;i++){
			char ch=a.charAt(i);
			System.out.printf("%c\n",ch);
			m =Integer.parseInt("" + ch);
			S = S + m;
		}
		System.out.printf("%d\n",S);
		}
	}
}