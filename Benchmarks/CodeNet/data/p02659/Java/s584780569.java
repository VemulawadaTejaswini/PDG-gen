import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	String B = sc.next();
    	B = B.replace(".", "");

    	long b = Long.parseLong(B);

    	long ans = (long) Math.floor((A*b+0.5)/100);

    	System.out.println(ans);
    }
}