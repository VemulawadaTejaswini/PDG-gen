import java.util.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        int[] b = new int[9];
        for(int i = 0; i < n; i++) {
        	if(a[i] < 400) {
        		b[0]++;
        	} else if(a[i] < 800) {
        		b[1]++;
        	} else if(a[i] < 1200) {
        		b[2]++;
        	} else if(a[i] < 1600) {
        		b[3]++;
        	} else if(a[i] < 2000) {
        		b[4]++;
        	} else if(a[i] < 2400) {
        		b[5]++;
        	} else if(a[i] < 2800) {
        		b[6]++;
        	} else if(a[i] < 3200) {
        		b[7]++;
        	} else {
        		b[8]++;
        	}
        }
        int cout = 0;
        for(int i = 0; i < 8; i++) {
        	if(b[i] > 0) {
        		cout++;
        	}
        }
        System.out.print(Math.max(1, cout) + " ");
        System.out.println(cout + b[8]);
    }
}