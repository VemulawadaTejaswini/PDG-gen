import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	double B = sc.nextDouble();

    	long times = (long)(A * (B*10000))/10000;
    	times = (long)Math.floor(times);

    	System.out.println((long)times);
    }
}