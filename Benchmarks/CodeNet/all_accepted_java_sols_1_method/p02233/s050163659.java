import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX = 44;
    public static void main(String args[]) {
	int[] fib = new int[MAX + 1];
	    fib[0] = 1;
	    fib[1] = 1;

	    for(int i = 2; i <= MAX; i++){
		fib[i] = fib[i-1] + fib[i-2];
            }
   

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    try {
		while(true){
		    int num = Integer.parseInt(br.readLine());
		    if (num <= 0) {
			break;
		    }
		    System.out.println(fib[num]);
		}
	    }

	    catch(Exception e){
		System.exit(0);
	    }
    }
}		    

