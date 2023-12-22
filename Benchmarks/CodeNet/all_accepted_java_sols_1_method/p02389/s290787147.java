import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int n1,n2;
		String str1,str2;

        Scanner in = new Scanner(System.in);

        str1 = in.next();
        str2 = in.next();

        n1 = Integer.parseInt(str1);
        n2 = Integer.parseInt(str2);

        System.out.println(n1*n2 + " " + (n1*2 + n2*2) );

        in.close();
    }
}