import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        String A = sc.next();
        int B = sc.nextInt();
        for(int i=0;i<A.length();i+=B) {
        System.out.print(A.charAt(i));
        }
	}

}
