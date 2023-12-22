import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	String a = sc.next();

    	if(Character.isUpperCase(a.charAt(0))) {
    		System.out.println("A");
    	} else {
    		System.out.println("a");
    	}


    }
}