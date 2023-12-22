import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();
	int h = sc.nextInt();
	int n = sc.nextInt();
	int[] x = new int[n];
	int[] y = new int[n];
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
		a[i] = sc.nextInt();
	}
	int[] xmax = new int[n];
	int[] xmin = new int[n];
	int[] ymax = new int[n];
	int[] ymin = new int[n];
	int j = 0;
	int k = 0;
	int l = 0;
	int m = 0;
	for(int i=0; i<n; i++) {
		switch(a[i]) {
		case 1:
			xmax[j] = x[i];
			j++;
			break;
		case 2:
			xmin[k] = x[i];
			k++;
			break;
		case 3:
			ymax[l] = y[i];
			l++;
			break;
		case 4:
			ymin[m] = y[i];
			m++;
			break;
		}
	}
	int x1 = 0;
	int x2 = w;
	int y1 = 0;
	int y2 = h;
	for(int i=0; i<j; i++) {
		x1 = Math.max(x1, xmax[i]);
	}
	for(int i=0; i<k; i++) {
		x2 = Math.min(x2, xmin[i]);
	}
	for(int i=0; i<l; i++) {
		y1 = Math.max(y1, ymax[i]);
	}
	for(int i=0; i<m; i++) {
		y2 = Math.min(y2, ymin[i]);
	}
	if(x2-x1 > 0 && (x2-x1)*(y2-y1) > 0) {
		System.out.println((x2-x1)*(y2-y1));
	} else {
		System.out.println(0);
	}
}
}
