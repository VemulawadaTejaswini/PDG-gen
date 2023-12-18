import java.util.Scanner;
import static java.lang.Math.*;

class Main {
    public static double Heron (double a, double b, double c) {
	double s = (a + b + c) / 2;
	double T = sqrt(s * (s-a) * (s-b) * (s-c));

	return T;
    }
    
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	double[] p = new double[8]; // A(x1, y1), B(x2, y2), C(x3, y3), P(xp, yp)
	double[] d = new double[6]; // AB, BC, CA, PA, PB, PC
	double[] S = new double[4]; // s1, s2, s3, S

	while (scan.hasNext()) {
	    for (int i=0; i<8; i++) {
		p[i] = scan.nextDouble();
	    }

	    d[0] = sqrt( pow((p[2]-p[0]),2) + pow(p[3]-p[1],2) ); // AB
	    d[1] = sqrt( pow((p[4]-p[2]),2) + pow(p[5]-p[3],2) ); // BC
	    d[2] = sqrt( pow((p[0]-p[4]),2) + pow(p[1]-p[5],2) ); // CA
	    
	    d[3] = sqrt( pow((p[0]-p[6]),2) + pow(p[1]-p[7],2) ); // AB
	    d[4] = sqrt( pow((p[2]-p[6]),2) + pow(p[3]-p[7],2) ); // BC
	    d[5] = sqrt( pow((p[4]-p[6]),2) + pow(p[5]-p[7],2) ); // CA

	    S[0] = Heron(d[0], d[3], d[4]); // PAB
	    S[1] = Heron(d[1], d[4], d[5]); // PBC
	    S[2] = Heron(d[2], d[5], d[3]); // PCA
	    S[3] = Heron(d[0], d[1], d[2]); // ABC

	    double tmp = round(S[0] + S[1] + S[2]);
	    S[3] = round(S[3]);

	    if (S[3] == tmp) {
		System.out.println("YES");
	    }
	    else {
		System.out.println("NO");
	    }

	    
	}	    
    }
}