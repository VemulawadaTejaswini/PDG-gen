import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int H1 = sc.nextInt();
    	int M1 = sc.nextInt();
    	int H2 = sc.nextInt();
    	int M2 = sc.nextInt();
    	int K = sc.nextInt();

    	int length = H2*60+M2-(H1*60+M1);

    	System.out.println(length-K);

    }
}