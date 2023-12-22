import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	int sum = 0;
    	while(true) {
        	String moji = sc.next();
    		if(moji.equals("-")) break;
    		int m = sc.nextInt();
    		for(i = 0; i < m; i++) {
    			int h = sc.nextInt();
    			moji = moji.substring(h) + moji.substring(0, h);
    		}
    		System.out.println(moji);
    	}
    }
}
