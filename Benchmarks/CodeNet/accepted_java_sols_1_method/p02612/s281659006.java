import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int mod = N%1000;
    	if(mod==0){
    		System.out.println(0);
    	} else {
    		System.out.println(1000-mod);
    	}

    }
}
