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

    	double times = (A * (B*1000))/1000;
    	times = Math.floor(times);

    	System.out.println((long)times);
    }
}
