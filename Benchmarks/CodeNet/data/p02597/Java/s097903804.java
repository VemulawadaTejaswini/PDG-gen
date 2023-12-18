import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String S = sc.next();
    	char[] c = S.toCharArray();
    	int numR = 0;
    	for(int i=0;i<S.length();i++) {
    		if(c[i]=='R') {
    			numR++;
    		}
    	}
    	if(numR==0) {
    		System.out.println(0);
    	} else {
    		int numR2 = 0;
    		for(int i=0;i<numR;i++) {
    			if(c[i]=='R') {
    				numR2++;
    			}

    		}
			int ans = numR - numR2;
			System.out.println(ans);
    	}

    }

}
