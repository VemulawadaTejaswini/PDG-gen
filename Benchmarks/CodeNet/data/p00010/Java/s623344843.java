import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double[] point = new double[6]; // x1, x2, x3, y1, y2, y3
	double[] mid = new double[4]; // mid_x1, mid_y1, mid_x2, mid_y2
	double[] a = new double[2];
	double x=0, y=0, r=0;
	boolean x_flag = true, y_flag = true;

	for (int i=0; i<n; i++) {
	    for (int j=0; j<6; j++) {
	        point[j] = scan.nextDouble();
	    }

	    int k = 0;
	    for (int j=0; j<4; j=j+2) {
		mid[j] = (point[k] + point[k+1]) / 2.0;
		mid[j+1] = (point[k+3] + point[k+4]) / 2.0;
		k++;
	    }

	    for (int j=0; j<2 ;j++) {
	        if (point[j+1]-point[j] == 0) {
		    y = (point[j+4] + point[j+3]) / 2.0;
		    y_flag = false;
		}
		else if (point[j+4]-point[j+3] == 0) {
		    x = (point[j+1] + point[j]) / 2.0;
		    x_flag = false;
		}
		else {
		    a[j] = (point[j+4]-point[j+3]) / (point[j+1]-point[j]);
		}
	    }

	    if (x_flag) {
		x = (a[0]*mid[0] - mid[1] - a[1]*mid[2] + mid[3])/(a[0] - a[1]);
	    }
	    
	    if (y_flag) {
		y = a[0]*(x - mid[0]) + mid[1];
	    }

	    r = Math.sqrt((x-point[0])*(x-point[0]) + (y-point[3])*(y-point[3]));

	    System.out.printf("%.3f %.3f %.3f\n", x, y, r);
	}
    }
}