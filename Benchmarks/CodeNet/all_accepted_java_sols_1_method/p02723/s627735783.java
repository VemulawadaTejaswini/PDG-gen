import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	String S = sc.next();

    	char[] A = S.toCharArray();

    	if(A[2]==A[3]&&A[4]==A[5]) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}
