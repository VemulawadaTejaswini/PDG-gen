import java.util.Scanner;

public class Main {
    void main() {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	
    	for(int i = 0; i < a.length; i++) {
    		a[i] = sc.nextInt();
    		}
    	for(int i = 0; i < a.length; i++) {
    		if(i != 0) {
    			System.out.print(" " + a[n - i - 1]);
    		}
    		else{
    			System.out.print(a[n - i - 1]);
    		}
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
