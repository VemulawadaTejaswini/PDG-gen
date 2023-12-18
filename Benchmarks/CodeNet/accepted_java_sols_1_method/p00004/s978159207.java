import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double[] input = new double[6];
		double x,y;
		int i;
		
		while(scan.hasNextDouble()){
			for(i=0;i<6;i++){
				input[i] = scan.nextDouble();
			}
			
			x = (input[2]*input[4] - input[1]*input[5]) / (input[0]*input[4] - input[1]*input[3]);
			y = (input[2]*input[3] - input[0]*input[5]) / (input[1]*input[3] - input[0]*input[4]);
			
			BigDecimal bdxTmp = new BigDecimal(x);
			BigDecimal bdyTmp = new BigDecimal(y);
			BigDecimal bdx = bdxTmp.setScale(3,BigDecimal.ROUND_HALF_UP);
			BigDecimal bdy = bdyTmp.setScale(3,BigDecimal.ROUND_HALF_UP);
			
			String ansX,ansY;
			ansX = String.format("%.3f", bdx.doubleValue());
			ansY = String.format("%.3f", bdy.doubleValue());
			
			System.out.println(ansX +" "+ ansY);
		}
		scan.close();
	}
}