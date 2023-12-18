import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;
			double A[] = new double[] {x1,y1};
			double B[] = new double[] {x2,y2};
			
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			
			double C[] = new double[] {x3,y3};
			double D[] = new double[] {x4,y4};
			
			int x5 = sc.nextInt();
			int y5 = sc.nextInt();
			int x6 = sc.nextInt();
			int y6 = sc.nextInt();
			
			double E[] = new double[] {x5,y5};
			double F[] = new double[] {x6,y6};
			
			double ABCD[] = new double[2];
			double ABEF[] = new double[2];
			double CDEF[] = new double[2];
			
			int r1 = cross(A,B,C,D,ABCD);
			int r2 = cross(A,B,E,F,ABEF);
			int r3 = cross(C,D,E,F,CDEF);
			
			boolean bad = false;
			if(r1 != 1 || r2 != 1 || r3 != 1) {
				bad = true;
			}
			double sum = -1;
			if(!bad) {
				sum = Math.abs(ABCD[1]*(ABEF[0] - CDEF[0]) + ABEF[1]*(CDEF[0] - ABCD[0]) + CDEF[1]*(ABCD[0] - ABEF[0]))/2.0;
				if(sum < 1.0e-9) {
					bad = true;
				}
			}
			if(!bad) {
				if(sum >= 1900000) {
					System.out.println("dai-kichi");
				}
				else if(sum >= 1000000) {
					System.out.println("chu-kichi");
				}
				else if(sum >= 100000) {
					System.out.println("kichi");
				}
				else {
					System.out.println("syo-kichi");
				}
			}
			else {
				System.out.println("kyo");
			}
			
		}
	}
	/*************************************/
	/* 2???????????????                       */
	/*      A + r(B - A) ??¨ C + s(D - C) */
	/*      P : ???????????§?¨?               */
	/*      return : =-1 : ???????????????    */
	/*               =0 : ????????????????????? */
	/*               =1 : ???????????????     */
	/*************************************/
	static int cross(double A[], double B[], double C[], double D[], double P[])
	{
		double r, s, AC[] = new double [2], BUNBO, EPS = 1.0e-8;
		int sw = -1;

		AC[0] = C[0] - A[0];
		AC[1] = C[1] - A[1];
		BUNBO = (B[0] - A[0]) * (D[1] - C[1]) - (B[1] - A[1]) * (D[0] - C[0]);
		if (Math.abs(BUNBO) > EPS) {
			r = ((D[1] - C[1]) * AC[0] - (D[0] - C[0]) * AC[1]) / BUNBO;
			s = ((B[1] - A[1]) * AC[0] - (B[0] - A[0]) * AC[1]) / BUNBO;
			if (r > -EPS && r < 1.0+EPS && s > -EPS && s < 1.0+EPS) {
				P[0] = A[0] + r * (B[0] - A[0]);
				P[1] = A[1] + r * (B[1] - A[1]);
				sw   = 1;
			}
			else
				sw = 0;
		}

		return sw;
	}
}