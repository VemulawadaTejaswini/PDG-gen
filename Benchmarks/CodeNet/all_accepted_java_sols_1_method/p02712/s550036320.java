import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();

    	long sum = 0;

    	for(int i=1;i<=N;i++) {
    		if((i%3!=0)&&(i%5!=0)) {
    			sum += i;
    		}
    	}
    	System.out.println(sum);


    }
}
