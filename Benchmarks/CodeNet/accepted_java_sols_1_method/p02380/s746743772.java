

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//文字列を読み取る。
			String[] strLine = insBR.readLine().split(" ");

			//小数点を鑑みて、double型に変換する。
			List<Double> list = new ArrayList<Double>();
			for(int i = 0; i < strLine.length; i++){
				list.add(Double.parseDouble(strLine[i]));
			}

			double dbBottom = list.get(0);
			double dbSide = list.get(1);
			double dbActAngle = list.get(2);
			double dbAngle = dbActAngle * Math.PI / 180;

			//面積。
			double dbSin = Math.sin(dbAngle);
			double dbArea = dbBottom * dbSide * dbSin / 2.0;
			String strArea = String.format("%1$.5f", dbArea);

			//残りの辺
			double dbPowAnother = dbBottom * dbBottom + dbSide * dbSide - 2 * dbBottom * dbSide * Math.cos(dbAngle);
			double dbAnother = Math.sqrt(dbPowAnother);
			double dbSum = dbBottom + dbSide + dbAnother;
			String strSum = String.format("%1$.5f", dbSum);

			//高さ。
			double dbHeght = dbArea / dbBottom * 2.0;
			String strHeght = String.format("%1$.5f", dbHeght);

			//出力。
			System.out.println(strArea);
			System.out.println(strSum);
			System.out.println(strHeght);

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

