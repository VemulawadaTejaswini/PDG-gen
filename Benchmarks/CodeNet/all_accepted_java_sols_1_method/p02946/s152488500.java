import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int X = sc.nextInt();
    	int K = sc.nextInt();

    	for (int i = K-X+1; i <= K+X-1; i++) {
    		if (i >= -1000000 && i <= 1000000){
    			System.out.print(i + " ");
    		}
    	} 
    }
}