import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int Slong = S.length();

        StringBuffer str = new StringBuffer(S);
        String R = str.reverse().toString();

		String result = "No";

        if(S.equals(R)) {
        	String S2 = S.substring(0,(Slong-1)/2);
        	StringBuffer str2 =  new StringBuffer(S2);
            String R2 = str2.reverse().toString();
        	if(S2.equals(R2)) {
            	String S3 = S.substring((Slong+3)/2-1,Slong);
            	StringBuffer str3 =  new StringBuffer(S3);
                String R3 = str3.reverse().toString();
        		if(S3.equals(R3)) {
        			result="Yes";
        		}
        	}
        }

		System.out.println(result);
	}
}