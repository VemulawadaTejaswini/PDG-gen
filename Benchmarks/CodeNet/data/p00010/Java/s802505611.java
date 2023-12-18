import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for(int i = 0;i < n ; i++){
			String[] tmpStr = br.readLine().split(" ");

			double[] input = new double[6];
			for(int j = 0; j < tmpStr.length ; j++){
				input[j] = Double.parseDouble(tmpStr[j]);
			}

			//?????????2?????????
			Point2D.Double p1 = new Point2D.Double((input[0] + input[2])/2, (input[1] + input[3])/2);
			Point2D.Double p2 = new Point2D.Double((input[2] + input[4])/2, (input[3] + input[5])/2);
			//?????????2?????????
			double a1 = -1/((input[1]-input[3])/(input[0]-input[2]));
			double a2 = -1/((input[3]-input[5])/(input[2]-input[4]));


			Equation e1 = new Equation(a1, -1, (a1*p1.x - p1.y));
			if(input[1] == input[3]){
				e1 = new Equation(1, 0, p1.x);
			}
			Equation e2 = new Equation(a2, -1, (a2*p2.x - p2.y));
			if(input[3] == input[5]){
				e2 = new Equation(1, 0, p2.x);
			}

			Point2D.Double center = Calc.solveEquation(e1, e2);

			System.out.printf("%.3f %.3f %.3f\n",Calc.round(center.getX()), Calc.round(center.getY()), Calc.round(center.distance(input[0], input[1])));
		}
	}

}

class Equation {
	double a;
	double b;
	double c;

	public Equation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
//??£???????¨??????¨
class Calc {

	public static Point2D.Double solveEquation (Equation e1, Equation e2) {
		// TODO ?????????????????????????????????????????????
		double[] input = new double[6];
		double[] reverse = new double[6];

		input[0] = reverse[3] = e1.a;
		input[1] = reverse[4] = e1.b;
		input[2] = reverse[5] = e1.c;
		input[3] = reverse[0] = e2.a;
		input[4] = reverse[1] = e2.b;
		input[5] = reverse[2] = e2.c;

		//System.out.println(input[0]+" "+input[1]+" "+input[2]);
		//System.out.println(input[3]+" "+input[4]+" "+input[5]);

		//??????a = 0???????????????????????\????????????
		if(input[0] == 0){
			for(int i = 0; i < 6; i++){
				input[i] = reverse[i];
			}
		}

		//????????§??????????????¬?????¢?????????????????¨?????????
		double k = input[3]/input[0];
		input[3] = 0;
		input[4] -= input[1]*k;
		input[5] -= input[2]*k;

		double k2 = input[4];
		input[4] = 1;
		input[5] /= k2;

		double k3 = input[1];
		input[1] = 0;
		input[2] -= input[5]*k3;

		input[2] /= input[0];
		input[0] = 1;

		//System.out.printf("%.3f %.3f\n", input[2], input[5]);
		return new Point2D.Double(input[2], input[5]);
	}

	public static double round(double a){
		double result = (double)Math.round(a*1000)/1000;
		return result;
	}
}