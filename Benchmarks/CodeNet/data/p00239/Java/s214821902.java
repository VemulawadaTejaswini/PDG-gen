import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.calorieCounting();
		return;
	}
	
	//カロリーを計算する
	private void calorieCounting() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		while (true) {
			
			try {
				
				String inputStr = bufferedReader.readLine();
				int confectioneryNum = Integer.parseInt(inputStr); //お菓子の数
				
				if (confectioneryNum == 0) {
					break;
				}
				
				LinkedList<Integer> proteinList = new LinkedList<Integer>(); //タンパク質のリスト
				LinkedList<Integer> lipidList = new LinkedList<Integer>(); //脂質のリスト
				LinkedList<Integer> carbohydrateList = new LinkedList<Integer>(); //炭水化物のリスト
				LinkedList<Integer> kcalList = new LinkedList<Integer>(); //カロリーのリスト
				
				//お菓子の情報を入力
				for (int i = 0; i < confectioneryNum; i++) {
					String inputStr2 = bufferedReader.readLine();
					String[] confectioneryInformationStrs = inputStr2.split(" ");
					int protein = Integer.parseInt(confectioneryInformationStrs[1]);
					int lipid = Integer.parseInt(confectioneryInformationStrs[2]);
					int carbohydrate = Integer.parseInt(confectioneryInformationStrs[3]);
					int kcal = (4 * protein) + (9 * lipid) + (4 * carbohydrate);
					
					proteinList.add(protein);
					lipidList.add(lipid);
					carbohydrateList.add(carbohydrate);
					kcalList.add(kcal);
				}
				
				LinkedList<Integer> canEatConfectioneryList = new LinkedList<Integer>(); //食べてもいい菓子の番号を管理する
				int index = 1; //お菓子番号
				Person person = new Person(); //お菓子を食べる人の情報
				
				//各栄養素、カロリーの制限値を入力
				String inputStr3 = bufferedReader.readLine();
				String[] personStrs = inputStr3.split(" ");
				person.setProtein(Integer.parseInt(personStrs[0]));
				person.setLipid(Integer.parseInt(personStrs[1]));
				person.setCarbohydrate(Integer.parseInt(personStrs[2]));
				person.setKcal(Integer.parseInt(personStrs[3]));
				
				for (int i = 0; i < confectioneryNum; i++) {
					
					boolean eatFlag = false; //trueなら食べられるお菓子
					
					//食べられるお菓子かどうかを判定する
					if (proteinList.get(i) < person.getProtein() && lipidList.get(i) < person.getLipid() &&
						carbohydrateList.get(i) < person.getCarbohydrate() && kcalList.get(i) < person.getKcal()) {
						eatFlag = true;
					}
					
					if (eatFlag) {
						canEatConfectioneryList.add(index);
					}
					
					index++;
				}
				
				if (canEatConfectioneryList.size() == 0) {
					
					System.out.println("NA");
					
				} else {
					
					for (int num : canEatConfectioneryList) {
						System.out.println(num);
					}
					
				}
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		}
	}
}

class Person {
	
	int protein = 0; //タンパク質
	int lipid = 0; //脂質
	int carbohydrate = 0; //炭水化物
	int kcal = 0; //カロリー
	
	public int getProtein() {
		return protein;
	}
	
	public void setProtein(int protein) {
		this.protein = protein;
	}
	
	public int getLipid() {
		return lipid;
	}
	
	public void setLipid(int lipid) {
		this.lipid = lipid;
	}
	
	public int getCarbohydrate() {
		return carbohydrate;
	}
	
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
}