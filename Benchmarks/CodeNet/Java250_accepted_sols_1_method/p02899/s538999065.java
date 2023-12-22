import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int[] a = new int[N+1];
	    int count = 0;
	    for(int i = 1; i <= N; i++) {
	        int s = sc.nextInt();
	        a[s] = i;
	    }
	    for(int j = 1; j <= N; j++) {
	        System.out.print(a[j]);
	        if(j < N) {
	            System.out.print(" ");
	        }else {
	            System.out.println("");
	        }
	    }
	}
}