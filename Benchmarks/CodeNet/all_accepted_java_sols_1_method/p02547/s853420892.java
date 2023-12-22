import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		String s="";
		for (int i=0; i<n; i++) {
			char c1=ob.next().charAt(0);
			s=s+c1;
			char c2=ob.next().charAt(0);
			s=s+c2;
		}
		for(int i=0;i<=s.length()-6;i+=2)
		{
		if((s.charAt(i)==s.charAt(i+1))&&(s.charAt(i+2)==s.charAt(i+3))&&(s.charAt(i+4)==s.charAt(i+5)))
		{System.out.println("Yes");System.exit(0);}
		}
		System.out.println("No");
	}
}