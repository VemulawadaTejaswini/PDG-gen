import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	BigDecimal B = BigDecimal.valueOf(sc.nextDouble());
    	//double B = sc.nextDouble();

    	BigDecimal times = B.multiply(BigDecimal.valueOf(A));

    	System.out.println(times.longValue());
    }
}