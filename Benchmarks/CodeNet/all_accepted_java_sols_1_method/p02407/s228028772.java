import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int a[] = new int[line];
		for (int i = 0; i < line; i++) {
		    a[i] = sc.nextInt();
		}
		
		for (int i = a.length - 1; i >= 0; i--) {
		    if (i == a.length - 1) {
		        System.out.print(a[i]);
		    } else {
		        System.out.print(" " + a[i]);
		    }
		    
		}
		System.out.println();
    }
}
