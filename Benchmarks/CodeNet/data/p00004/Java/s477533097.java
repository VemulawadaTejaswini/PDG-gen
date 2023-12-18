import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double[] input = new double[6];
		double[] tmp = new double[6];
		double x,y;
		int i;
		
		while(scan.hasNextDouble()){
			for(i=0;i<6;i++){
				input[i] = scan.nextDouble();
				tmp[i] = input[i];
			}
			for(i=0;i<3;i++)
				input[i] = tmp[i] * tmp[3];
			for(i=3;i<6;i++)
				input[i] = tmp[0] * tmp[i];
			
			y = (input[2]-input[5])/(input[1]-input[4]);
			x = (input[2]-input[1]*y)/input[0];
			System.out.println("");
			
			BigDecimal bdxTmp = new BigDecimal(x);
			BigDecimal bdyTmp = new BigDecimal(y);
			BigDecimal bdx = bdxTmp.setScale(3,BigDecimal.ROUND_HALF_UP);
			BigDecimal bdy = bdyTmp.setScale(3,BigDecimal.ROUND_HALF_UP);
			
			System.out.println(bdx.doubleValue() +" "+ bdy.doubleValue());
		}
		scan.close();
	}
}