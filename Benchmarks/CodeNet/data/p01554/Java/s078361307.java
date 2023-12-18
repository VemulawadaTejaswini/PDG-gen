
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		run();
	}
	public void run() {
		try {
			// インプットデータ取得
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cardNo = Integer.parseInt(br.readLine());

			// 施錠は"0"、開錠は"1"
			String openFlg = "0";

			ArrayList<String> cardList = new ArrayList<String>();
			while(br != null){
				for(int i = 0; i < cardNo; i++){
					cardList.add(br.readLine());
				}
				int touchNo = Integer.parseInt(br.readLine());
				for(int j = 0; j < touchNo; j++){
					String usr = br.readLine();
					if(!cardList.contains(usr)){
						System.out.println("Unknown " + usr);
					} else {
						if(openFlg.equals("1")){
							openFlg = "0";
							System.out.println("Closed by " + usr);
						} else {
							openFlg = "1";
							System.out.println("Opened by " + usr);
						}
					}
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}
