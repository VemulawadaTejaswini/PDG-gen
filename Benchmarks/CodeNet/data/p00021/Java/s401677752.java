import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Parallelism {

	public class SlopeAndConstant{
		public Float slope;
		public Float constant;

		public SlopeAndConstant(float slope, float constant){
			this.slope		= slope;
			this.constant	= constant;
		}
	}

	public SlopeAndConstant calculateCoefficient(float x_1, float y_1, float x_2, float y_2){
		if(x_1 == x_2){
			return new SlopeAndConstant(Float.NaN, x_1);
		} else {
			float slope		= (y_2 - y_1)/(x_2 - x_1);
			float constant	= y_1 - slope * x_1;
			return new SlopeAndConstant(slope, constant);
		}
	}

	public boolean judgePaarallelism(SlopeAndConstant dataLineA, SlopeAndConstant dataLineB){
		boolean isParallel = false;
		if(dataLineA.slope.equals(dataLineB.slope) && !dataLineA.constant.equals(dataLineB.constant)){
			isParallel = true;
		}
		return isParallel;
	}

	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int numSet = Integer.parseInt(br.readLine());
		if(numSet > 100)	numSet = 100;

		Parallelism parallelism = new Parallelism();
		for(int iSet = 0; iSet < numSet; iSet++){
			String set = br.readLine();
			String[] parameters = set.split(" ");

			float aX_1 = Float.parseFloat(parameters[0]);	if(aX_1 < -100 || aX_1 > 100)	break;
			float aY_1 = Float.parseFloat(parameters[1]);	if(aY_1 < -100 || aY_1 > 100)	break;
			float aX_2 = Float.parseFloat(parameters[2]);	if(aX_2 < -100 || aX_2 > 100)	break;
			float aY_2 = Float.parseFloat(parameters[3]);	if(aY_2 < -100 || aY_2 > 100)	break;

			float bX_1 = Float.parseFloat(parameters[4]);	if(bX_1 < -100 || bX_1 > 100)	break;
			float bY_1 = Float.parseFloat(parameters[5]);	if(bY_1 < -100 || bY_1 > 100)	break;
			float bX_2 = Float.parseFloat(parameters[6]);	if(bX_2 < -100 || bX_2 > 100)	break;
			float bY_2 = Float.parseFloat(parameters[7]);	if(bY_2 < -100 || bY_2 > 100)	break;

			SlopeAndConstant dataLineA = parallelism.calculateCoefficient(aX_1, aY_1, aX_2, aY_2);
			SlopeAndConstant dataLineB = parallelism.calculateCoefficient(bX_1, bY_1, bX_2, bY_2);

			if(parallelism.judgePaarallelism(dataLineA, dataLineB) == true)	System.out.println("YES");
			else															System.out.println("NO");

		}
	}
}