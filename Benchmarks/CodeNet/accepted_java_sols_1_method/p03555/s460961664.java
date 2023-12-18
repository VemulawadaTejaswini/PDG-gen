import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String S=sc.next();
		char[] c=sc.next().toCharArray();
		char[] a=new char[c.length];
		int k=0;
		for(int i=c.length-1;i>=0;i--) {
			a[k]=c[i];
			k++;
		}
		if(S.equals(String.valueOf(a)))System.out.println("YES");
		else System.out.println("NO");
	}
}
