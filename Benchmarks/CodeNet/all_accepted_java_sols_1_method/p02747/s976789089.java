import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		if (arr.length % 2 == 1) {
		    System.out.println("No");
		    return;
		}
		for (int i = 0; i < arr.length; i++) {
		    if ((i % 2 == 0 && arr[i] == 'h') ||
		        (i % 2 == 1 && arr[i] == 'i')) {
		        } else {
		            System.out.println("No");
		            return;
		        }
		}
	    System.out.println("Yes");
	}
}
