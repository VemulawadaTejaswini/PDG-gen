import java.util.*;

public class Main {
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();
    	while(true) {
    		if(System.currentTimeMillis() - start > 10)
				break;
    	}
    	long end = System.currentTimeMillis();
    	System.out.println((end - start)  + "ms");
    }
}
