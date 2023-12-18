import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int C1 = 0;
    	int C2 = 0;
    	int C3 = 0;
    	int C4 = 0;
    	for(int i=0;i<N;i++) {
    		String S = sc.next();
    		switch(S) {
    		case "AC":
    			C1++;
    			break;
    		case "WA":
    			C2++;
    			break;
    		case "TLE":
    			C3++;
    			break;
    		case "RE":
    			C4++;
    			break;
    		}
    	}
    	System.out.println("AC x "+C1);
    	System.out.println("WA x "+C2);
    	System.out.println("TLE x "+C3);
    	System.out.println("RE x "+C4);

    }
}