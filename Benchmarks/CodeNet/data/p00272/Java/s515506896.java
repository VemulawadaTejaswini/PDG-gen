package pasokonkousien;

public class Toi22103 {
	int[] seki = {3,1,4,2};
	int[] maisu = {10,4,1,5};
	int[] kingaku = new int [5];
	int n;
	int oseki;
	
	
	
	public void keisan(){
		for(n=0;n<4;n++){
			oseki =seki[n];
			switch(oseki){
			case 1: kingaku[n] = 6000 * maisu[n];
				break;
			case 2: kingaku[n] = 4000 * maisu[n];
			break;
			case 3: kingaku[n] = 3000 * maisu[n];
			break;
			default : kingaku[n] = 2000 * maisu[n];
			break;
			
			}
			System.out.println(kingaku[n]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Toi22103 toi = new Toi22103();
		toi.keisan();
	}

}