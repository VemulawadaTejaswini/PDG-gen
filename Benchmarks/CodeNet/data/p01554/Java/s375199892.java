package competition;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// インプットデータ取得
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cardCount = 0;
			int touchCount = 0;
			int cardNo = 0;
			int touchNo = 0;
			// 施錠は"0"、開錠は"1"
			String openFlg = "0";

			ArrayList<String> cardList = new ArrayList<String>();

			while(true){

				if(cardCount == 0){
					cardNo = Integer.parseInt(br.readLine());
					cardCount++;
					continue;
				}

				if(cardNo != cardCount){
					cardList.add(br.readLine());
					cardCount++;
					continue;
				} else {
					if(touchNo == 0){
						touchNo = Integer.parseInt(br.readLine());
						touchCount++;
						continue;

					} else {
						if(touchCount != touchNo){
							if(cardList.contains(br.readLine())){
								if(openFlg.equals("1")){
									openFlg = "0";
									System.out.println("Opened by " + br.readLine());
								} else {
									openFlg = "1";
									System.out.println("Closed by " + br.readLine());
								}
							} else {
								System.out.println("Unknown " + br.readLine());
							}
							touchCount++;
							continue;
						} else {
							break;
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
