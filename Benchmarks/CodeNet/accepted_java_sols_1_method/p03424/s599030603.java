import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		String s[]=new String[n];
		int i;
		String c,d;
		boolean flag=false;
		for(i=0;i<n;i++){
			c=stdin.next();
			s[i]=c;
		}
		for(i=0;i<n;i++){
			d=s[i];
			if(d.contains("Y"))
				flag=true;
		}
		if(flag)
			System.out.println("Four");
		else
			System.out.println("Three");
	}
}