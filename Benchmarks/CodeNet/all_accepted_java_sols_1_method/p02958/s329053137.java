import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	    int n = Integer.parseInt(sc.next());
	    int[] array = new int[n];
	    for (int i = 0; i < n; i++) {
	        array[i] = Integer.parseInt(sc.next());
	    }
	    int cnt = 0;
	    for (int i = 0; i < n; i++) {
	        if (array[i] != i + 1) {
	            cnt++;
	        }
	    }
	    if (cnt == 0 || cnt == 2) {
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
	    }
    }
}
