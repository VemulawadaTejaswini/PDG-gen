import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Random r = new Random();
    	long start = System.currentTimeMillis();
    	while(true) {
    		int d = r.nextInt(100);
    		System.out.println(d);
    		if(System.currentTimeMillis() - start > 10)
				break;
    	}
    	long end = System.currentTimeMillis();
    	System.out.println((end - start)  + "ms");
    }
}
