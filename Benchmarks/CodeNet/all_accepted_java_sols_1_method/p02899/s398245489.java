import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] jun = new int[n];
	for (int i=1; i<=n; i++) {
	    jun[sc.nextInt() - 1] = i;
	}
	for (int i=0; i<n; i++) {
	    System.out.print(jun[i] + " ");
	}		 
    }
}
