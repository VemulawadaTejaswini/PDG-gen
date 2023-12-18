import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	for(int i=1;i<=5;i++) {
    		int x = sc.nextInt();
    		if(x==0) {
    			System.out.println(i);
    		}
    	}

    }
}