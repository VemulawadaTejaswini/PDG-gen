import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//ここから書き換える
		Scanner sc = new Scanner (System.in);
		
		String stationStr  = sc.next();
		String[] staArr = new String[3];
		boolean busFlg=false;
		String result;

		for(int i=0;i<3;i++){
			staArr[i]=stationStr.substring(i,i+1);
		}
		
		for(int i=0;i<2;i++){
			if(staArr[i].equals(staArr[i+1])){
				//隣の駅と一致したら何もしない
			}else{
				busFlg=true;
				break;
			}
		}


		result = (busFlg == true) ? "Yes" : "No";
		System.out.println(result);



//ここまで書き換える
	}
 
}