
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	String S=sc.next();
	int A=Integer.valueOf(S.substring(0,2));
	int B=Integer.valueOf(S.substring(2));
	boolean a1=(A>=1&&A<=12);
	boolean b1=(B>=1&&B<=12);
	
	if(a1&&b1) {
		System.out.println("AMBIGUOUS");
		
	}else if(!a1&&b1) {
		System.out.println("YYMM");
		
		
	}else if(a1&&!b1) {
		System.out.println("MMYY");
		
	}else if(!a1&&!b1) {
		System.out.println("NA");
		
	}
	
		
	}
	

	
}
		