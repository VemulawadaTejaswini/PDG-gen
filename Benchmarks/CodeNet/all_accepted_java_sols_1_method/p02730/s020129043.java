import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String input_line = sc.nextLine();
        int N=input_line.length();

        String string1=input_line.substring(0, (N-1)/2);
        String string2=input_line.substring((N+3)/2-1,N);

        StringBuffer sb1 = new StringBuffer(string1);
        StringBuffer sb2 = new StringBuffer(string2);
        StringBuffer sb3 = new StringBuffer(input_line);

        String string1_rev=sb1.reverse().toString();
        String string2_rev=sb2.reverse().toString();
        String input_line_rev=sb3.reverse().toString();

        if(string1_rev.equals(string1)&&string2_rev.equals(string2)&&input_line_rev.equals(input_line)) {
        	System.out.print("Yes");
        }
        else {
        	System.out.print("No");
        }

	}

}