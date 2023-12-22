import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int A,B,C,D;
		A = Character.getNumericValue(s.charAt(0));
		B = Character.getNumericValue(s.charAt(1));
		C = Character.getNumericValue(s.charAt(2));
		D = Character.getNumericValue(s.charAt(3));
		
			if(A+B+C+D==7)System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
			else if(A+B+C-D==7)System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
			else if(A+B-C+D==7)System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
			else if(A+B-C-D==7)System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
			else if(A-B+C+D==7)System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
			else if(A-B+C-D==7)System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
			else if(A-B-C+D==7)System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
			else if(A-B-C-D==7)System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
	}
}