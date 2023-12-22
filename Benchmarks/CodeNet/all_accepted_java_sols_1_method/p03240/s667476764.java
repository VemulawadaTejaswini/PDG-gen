import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrX = new int[n];
		int[] arrY = new int[n];
		int[] arrH = new int[n];
		int idx = 0;
		for (int i = 0; i < n; i++) {
		    arrX[i] = sc.nextInt();
		    arrY[i] = sc.nextInt();
		    arrH[i] = sc.nextInt();
		    if (arrH[i] != 0) {
		        idx = i;
		    }
		}
		for (int x = 0; x <= 100; x++) {
		    for (int y = 0; y <= 100; y++) {
		        int h = Math.abs(x - arrX[idx]) + Math.abs(y - arrY[idx]) + arrH[idx];
		        if (h < 1) { 
		            continue;
		        }
		        boolean flag = true;
		        for (int i = 0; i < n; i++) {
		            if (Math.max(h - Math.abs(x - arrX[i]) - Math.abs(y - arrY[i]), 0) != arrH[i]) {
		                flag = false;
		                break;
		            } 
		        }
		        if (flag) {
		            System.out.println(x + " " + y + " " + h);
		            return;
		        }
		    }
		}
	}
}
