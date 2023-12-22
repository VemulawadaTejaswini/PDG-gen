
import java.util.Scanner;

public class Main {
	final static long limit = 1000000000000000000l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long mul = 1l;
        boolean isOver = false;
        
        for(int i=0; i<N; i++) {
        	long a = sc.nextLong();
        	if(a==0) {
        		System.out.println(0);
        		return;
        	}
        	if (mul>limit/a) {
        		isOver = true;
        	}else {
            	mul *= a;
        	}
        }
        
        if(isOver) {
        	System.out.println(-1);
        }else {
        	System.out.println(mul);
        }
        
	}

}
