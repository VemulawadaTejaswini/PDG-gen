import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int K = sc.nextInt();

    	long LCM = lcm(K,360);

    	System.out.println(LCM/K);

    }

    static long lcm (int a, int b) {
    	int temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (int)(c/b);
    }
}