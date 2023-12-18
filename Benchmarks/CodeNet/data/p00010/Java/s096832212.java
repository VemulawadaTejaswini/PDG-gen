import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			float x1=sc.nextFloat();
			float y1=sc.nextFloat();
			float x2=sc.nextFloat();
			float y2=sc.nextFloat();
			float x3=sc.nextFloat();
			float y3=sc.nextFloat();
			float[] Sixcoeff =MakeSixCoeff(x1,y1,x2,y2,x3,y3);
			float[] sols = Solve(Sixcoeff[0],Sixcoeff[1],Sixcoeff[2],Sixcoeff[3],Sixcoeff[4],Sixcoeff[5]);
			double r = Math.sqrt((double) (sols[0]-x1)*(sols[0]-x1)+(sols[1]-y1)*(sols[1]-y1));
			System.out.printf("%.3f %.3f %.3f\n",sols[0],sols[1],r);
		}
	}


/**
 * This function connects between Main and Solve function below.
 */

	static float[] MakeSixCoeff(float x1, float y1, float x2, float y2, float x3, float y3){
		float[] SixCoeff = new float[6];
		SixCoeff[0]=2*(x2-x1);
		SixCoeff[1]=2*(y2-y1);
		SixCoeff[2]=y2*y2-y1*y1+x2*x2-x1*x1;
		SixCoeff[3]=2*(x3-x1);
		SixCoeff[4]=2*(y3-y1);
		SixCoeff[5]=y3*y3-y1*y1+x3*x3-x1*x1;
		return SixCoeff;
	}

/**
 * This Function is the reuse of Probrem No.0004
 */
	static float[] Solve(float a, float b, float c, float d, float e, float f){
		float[] sols = new float[2];
		sols[0] = (float) (e*c-b*f)/(a*e-b*d);
		sols[1] = (float) (a*f-d*c)/(a*e-b*d);
		for(int i=0;i<=1;i++){
			if(sols[i]==-0){sols[i]=0;}
		}
		return sols;
	}
}