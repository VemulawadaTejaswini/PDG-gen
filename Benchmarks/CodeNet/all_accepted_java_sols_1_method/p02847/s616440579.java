
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.contentEquals("SUN")) {
            System.out.println(7);
        }else if(S.contentEquals("MON")) {
        	System.out.println(6);
        }else if(S.contentEquals("TUE")) {
        	System.out.println(5);
        }else if(S.contentEquals("WED")) {
        	System.out.println(4);
        }else if(S.contentEquals("THU")) {
        	System.out.println(3);
        }else if(S.contentEquals("FRI")) {
        	System.out.println(2);
        }else if(S.contentEquals("SAT")) {
        	System.out.println(1);
        }

	}
}




