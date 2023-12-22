import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int count = 1;
      
        while (N > X) {
        	N -= X;
        	count++;
        }
      
        T = T * count;
        System.out.println(T);
    }
}