import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	long N = sc.nextLong();
    	if(N==1) {
    		System.out.println("a");
    	} else {

    		long X = 26;
    		int cnt = 0;
    		while(X<N) {
    			X = 26 * (X+1);
    			cnt++;
    		}
    		X = X/26 -1 ;
        	N = N-X-1;
        	long[] x = new long[11];
        	int keta = 0;
        	while(N>0) {
        		x[keta] = N%26;
        		keta++;
        		N = N/26;
        	}
        	for(int i=cnt;i>=0;i--) {
        		if(i>0) {
        			long y = x[i];
        			long codepoint =  97+y;
        			char c = (char)codepoint;
        			System.out.print(c);
        		} else {
        			long y = x[i];
        			y++;
        			long codepoint =  96+y;
        			char c = (char)codepoint;
        			System.out.println(c);
        		}
        	}
    	}
    }
}