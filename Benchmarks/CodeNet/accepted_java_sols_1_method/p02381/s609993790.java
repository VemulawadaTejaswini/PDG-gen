
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		try{
			List<String> dispList = new ArrayList<String>();
			while(true){

				String strPeople = insBR.readLine();
				if("0".equals(strPeople)){
					break;
				}
				double dbPeople = Double.parseDouble(strPeople);

				//文字列を読み取る。
				String[] strLine = insBR.readLine().split(" ");

				//小数点を鑑みて、double型に変換する。
				List<Double> list = new ArrayList<Double>();
				for(int i = 0; i < strLine.length; i++){
					list.add(Double.parseDouble(strLine[i]));
				}

				//平均値。
				double dbSum = 0.0;
				for(int i = 0; i < list.size(); i++){
					dbSum += list.get(i);
				}
				double dbAverage = dbSum / dbPeople;
				//System.out.println("平均 " + dbAverage);

				//偏差。
				List<Double> devList = new ArrayList<Double>();
				for(int i = 0; i < list.size(); i++){
					double dbAct = list.get(i) - dbAverage;
					devList.add(dbAct);
				}

				//偏差合計。
				dbSum = 0.0;
				for(int i = 0; i < devList.size(); i++){
					double dbAct = devList.get(i);
					dbSum += dbAct * dbAct;
				}
				double dbDisp = dbSum / dbPeople;
				dbDisp = Math.sqrt(dbDisp);
				String strDevation = String.format("%1$.5f", dbDisp);
				dispList.add(strDevation);

			}

			//出力。
			for(int i = 0; i < dispList.size(); i++){
				System.out.println(dispList.get(i));
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

