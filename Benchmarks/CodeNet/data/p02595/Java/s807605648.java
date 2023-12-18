import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long N = sc.nextInt();
    	long D = sc.nextInt();

    	int ans = 0;
    	for(int i=0;i<N;i++) {
    		long x = sc.nextInt();
    		long y = sc.nextInt();
    		if(x*x+y*y<=D*D) {
    			ans++;
    		}
    	}
    	System.out.println(ans);

    }
}