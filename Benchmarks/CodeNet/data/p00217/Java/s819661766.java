import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.peopleWalkedTheLongestDistanceSearch();
		return;
	}
	
	//一日で一番長い距離を歩いた人を探す
	private void peopleWalkedTheLongestDistanceSearch() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		while (true) {
			
			try {
				
				String inputStr = bufferedReader.readLine();
				int patientsNum = Integer.parseInt(inputStr); //患者の数
				
				if (patientsNum == 0) {
					break;
				}
				
				HashMap<Integer, Integer> patientsMap = new HashMap<Integer, Integer>();
				
				for (int i = 0; i < patientsNum; i++) {
					String inputStr2 = bufferedReader.readLine();
					String[] patientsInformation = inputStr2.split(" ");
					int patientNum = Integer.parseInt(patientsInformation[0]);
					int d1 = Integer.parseInt(patientsInformation[1]);
					int d2 = Integer.parseInt(patientsInformation[2]);
					patientsMap.put(patientNum, d1 + d2);
				}
				
				int patientsLongestNum = 0; //最も長く歩いた患者の番号
				int theLongestTotalDistanceNum = 0; //最も長く歩いた患者の歩いた距離
				int tmp = 0;
				for(Map.Entry e : patientsMap.entrySet()) {
					
					tmp = (int) e.getValue();
					
					if (tmp >= theLongestTotalDistanceNum) {
						patientsLongestNum = (int) e.getKey();
						theLongestTotalDistanceNum = (int) e.getValue();
					}
					
				}
				
				System.out.printf("%d %d\n", patientsLongestNum, theLongestTotalDistanceNum);
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		}
	}
}