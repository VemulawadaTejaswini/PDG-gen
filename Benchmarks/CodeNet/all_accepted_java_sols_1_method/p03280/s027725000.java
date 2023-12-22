import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        //String N=sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((A-1)*(B-1));

	}

}