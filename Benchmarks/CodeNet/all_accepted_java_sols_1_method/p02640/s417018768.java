import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int X = sc.nextInt();
    	int Y = sc.nextInt();

    	if((Y-2*X)>=0&&(Y-2*X)%2==0&&(4*X-Y)>=0&&(4*X-Y)%2==0) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}

    }
}