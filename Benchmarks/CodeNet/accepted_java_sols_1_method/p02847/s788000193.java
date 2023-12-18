import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		if(S.equals("SUN"))
			System.out.println(7);
		if(S.equals("MON"))
			System.out.println(6);
		if(S.equals("TUE"))
			System.out.println(5);
		if(S.equals("WED"))
			System.out.println(4);
		if(S.equals("THU"))
			System.out.println(3);
		if(S.equals("FRI"))
			System.out.println(2);
		if(S.equals("SAT"))
			System.out.println(1);
	}
}
