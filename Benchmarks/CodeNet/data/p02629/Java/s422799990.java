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
        	N = N-1;
        	long[] x = new long[11];
        	int keta = 0;
        	while(N>0) {
        		x[keta] = N%26;
        		keta++;
        		N = N/26;
        	}
        	for(int i=keta-1;i>=0;i--) {
        		if(i>0) {
        			long y = x[i];
        			if(y==0) {
        				y +=26;
        			}
        			long codepoint =  96+y;
        			char c = (char)codepoint;
        			System.out.print(c);
        		} else {
        			long y = x[i];
        			y++;
        			if(y==0) {
        				y +=26;
        			}
        			long codepoint =  96+y;
        			char c = (char)codepoint;
        			System.out.println(c);
        		}
        	}
    	}
    }
}