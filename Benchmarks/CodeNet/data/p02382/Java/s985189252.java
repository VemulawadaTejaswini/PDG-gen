

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		try{

			//最初の数値。
			String strN = insBR.readLine();
			int intN = Integer.parseInt(strN);

			//x と y の数値。
			double[][] dbXY = new double[2][intN];
			for(int i  = 0; i < dbXY.length; i++){
				String[] strXY = insBR.readLine().split(" ");
				for(int j = 0; j < strXY.length; j++){
					dbXY[i][j] = Double.parseDouble(strXY[j]);
				}
			}

			//マンハッタン距離。
			double dbManhattan = 0.0;
			List<Double> dbList = new ArrayList<Double>();
			for(int i = 0; i < intN; i++){
				double dbDistance = dbXY[0][i] - dbXY[1][i];
				dbDistance = Math.abs(dbDistance);
				dbList.add(dbDistance);
				dbManhattan += dbDistance;
			}
			String strManhattan = String.format("%1$.5f", dbManhattan);

			// p=2 のときのユークリッド距離。
			double dbEuclid = 0.0;
			for(int i = 0; i < dbList.size(); i++){
				double dbDistance = dbList.get(i);
				dbDistance = Math.pow(dbDistance, 2);
				dbEuclid += dbDistance;
			}
			dbEuclid = Math.sqrt(dbEuclid);
			String strEuclid = String.format("%1$.5f", dbEuclid);

			// p=3 のときのユークリッド距離。
			double dbNextEuclid = 0.0;
			for(int i = 0; i < dbList.size(); i++){
				double dbDistance = dbList.get(i);
				dbDistance = Math.pow(dbDistance, 3);
				dbNextEuclid += dbDistance;
			}
			dbNextEuclid = Math.cbrt(dbNextEuclid);
			String strNextEuclid = String.format("%1$.5f", dbNextEuclid);

			//チェビシェフ距離。
			double dbChebyshev = 0.0;
			for(int i = 0; i < dbList.size(); i++){
				double dbDistance = dbList.get(i);
				if(dbChebyshev < dbDistance){
					dbChebyshev = dbDistance;
				}
			}
			String strChebyshev = String.format("%1$.5f", dbChebyshev);

			//出力。
			System.out.println(strManhattan);
			System.out.println(strEuclid);
			System.out.println(strNextEuclid);
			System.out.println(strChebyshev);

		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

