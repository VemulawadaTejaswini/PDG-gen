import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	int M = sc.nextInt();

    	System.out.println(N*(N-1)/2+M*(M-1)/2);
    }
}