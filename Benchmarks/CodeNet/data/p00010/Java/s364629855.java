import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	double[] points = new double[6];
	double ep = 0.0001;
	double l,m;
	for(int i=0 ; i<n ; i++) {
	    for(int j=0 ; j<6 ; j++)
		points[j] = s.next();
	    for(int j=1 ; j<3 ; j++) {
		points[2*j] -= points[0];
		points[2*j+1] -= points[1];
	    }
	    l = (points[3]*points[3]+points[4]*points[4])*(points[3]-points[5])/(points[2]*points[5]-points[4]*points[3]);
	    m = -(points[4]*points[4]+points[5]*points[5]+l*points[4])/points[5];

	    System.out.println(points[0]-l/2 + " " + points[1]-m/2 + " " + (l*l+m*m)/4);

	}
    }
}