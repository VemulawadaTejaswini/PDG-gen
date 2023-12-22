import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b;
		String str1,str2;

        Scanner in = new Scanner(System.in);

        str1 = in.next();
        str2 = in.next();

        a = Integer.parseInt(str1);
        b = Integer.parseInt(str2);

        if(a == b) System.out.println("a == b");
        else if(a < b) System.out.println("a < b");
        else System.out.println("a > b");

        in.close();
    }
}