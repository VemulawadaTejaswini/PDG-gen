import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	long K = sc.nextLong();

    	if(A>=K) {
    		System.out.println((A-K)+" "+B);
    	} else {
    		if(A+B>=K) {
    			System.out.println("0 "+(A+B-K));
    		} else {
    			System.out.println("0 0");
    		}
    	}

    }

}
