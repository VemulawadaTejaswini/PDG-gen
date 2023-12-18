import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ResurrectionOfLosersN[] = new int[6];
		double ResurrectionOfLosersT[] = new double[6];
		double time[][] = new double[3][8];
		BigDecimal number;
		DecimalFormat format = new DecimalFormat("#.#");
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(2);
		int num[][] = new int[3][8];

		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 8 ; j++){
				num[i][j] = scan.nextInt();
				time[i][j] =scan.nextDouble();
			}
		}
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 5 ; j++){
				for(int k = 0 ; k < 5-j ; k++){
					if(time[i][k] > time[i][k+1]){
						double D = time[i][k];
						time[i][k] = time[i][k+1];
						time[i][k+1] = D;
						int d = num[i][k];
						num[i][k] = num[i][k+1];
						num[i][k+1] = d;
					}
				}
			}
		}
		for(int i = 0 ; i < 3 ; i++){
			number = new BigDecimal(time[i][0]);
			System.out.println(num[i][0] + " " + format.format(number));
			number = new BigDecimal(time[i][1]);
			System.out.println(num[i][1] + " " + format.format(number));
			ResurrectionOfLosersN[i*2] = num[i][2];
			ResurrectionOfLosersT[i*2] = time[i][2];
			ResurrectionOfLosersN[i*2+1] = num[i][3];
			ResurrectionOfLosersT[i*2+1] = time[i][3];
		}
		for(int j = 0 ; j < 5 ; j++){
			for(int k = 0 ; k < 5-j ; k++){
				if(ResurrectionOfLosersT[k] > ResurrectionOfLosersT[k+1]){
					double D = ResurrectionOfLosersT[k];
					ResurrectionOfLosersT[k] = ResurrectionOfLosersT[k+1];
					ResurrectionOfLosersT[k+1] = D;
					int d = ResurrectionOfLosersN[k];
					ResurrectionOfLosersN[k] = ResurrectionOfLosersN[k+1];
					ResurrectionOfLosersN[k+1] = d;
				}
			}
		}
		number = new BigDecimal(ResurrectionOfLosersT[0]);
		System.out.println(ResurrectionOfLosersN[0] + " " + format.format(number));
		number = new BigDecimal(ResurrectionOfLosersT[1]);
		System.out.println(ResurrectionOfLosersN[1] + " " + format.format(number));
	}
}