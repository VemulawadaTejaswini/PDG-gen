import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] xArr = new int[n];
		int[] yArr = new int[n];
		int[] hArr = new int[n];
		int hh = 0;
		int xx = 0;
		int yy = 0;
		for (int i = 0; i < n; i++) {
		    xArr[i] = sc.nextInt();
		    yArr[i] = sc.nextInt();
		    hArr[i] = sc.nextInt();
		    if (hArr[i] != 0 && hh == 0) {
		        hh = hArr[i];
		        xx = xArr[i];
		        yy = yArr[i];
		    }
		}
		for (int i = 0; i <= 100; i++) {
		    for (int j = 0; j <= 100; j++) {
		        int height = hh + Math.abs(xx - i) + Math.abs(yy - j);
		        boolean flag = true;
		        for (int k = 0; k < n; k++) {
		            if (Math.max(height - Math.abs(xArr[k] - i) - Math.abs(yArr[k] - j), 0) != hArr[k]) {
		                flag = false;
		                break;
		            }
		        }
		        if (flag) {
		            System.out.println(i + " " + j + " " + height);
		            return;
		        }
		    }
		}
	}
}
