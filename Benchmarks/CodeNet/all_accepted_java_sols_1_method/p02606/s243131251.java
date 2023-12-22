import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int L = sc.nextInt();
    	int R = sc.nextInt();
    	int d = sc.nextInt();
    	int ans = 0;
    	sc.close();
    	for(int i=L;i<=R;i++) {
    		if(i%d==0) {
    			ans++;
    		}
    	}
    	System.out.println(ans);

    }
}
