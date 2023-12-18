import java.util.Scanner;
public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		//半径と円周
		double dbradius = scan.nextDouble();
		double dbpai = Math.PI;

		//面積と円周
		double dbArea = (double)dbpai * dbradius * dbradius;
		double dbCirL = (double)2 * dbpai * dbradius;

		//formatメソッドで小数点の桁数を指定
		System.out.println(String.format("%.6f",dbArea)
								+ " " + String.format("%.6f", dbCirL));

		scan.close();
	}
}
