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
			int count = 0;
			int cardNo = 0;
			int touchNo = 0;
			// 施錠は"0"、開錠は"1"
			String openFlg = "0";
			
			ArrayList<String> cardList = new ArrayList<String>();
			
			while(true){
				
				if(count == 0){
					cardNo = Integer.parseInt(br.readLine());
					count++;
					continue;
				}
				
				if(cardNo != count){
					cardList.add(br.readLine());
					count++;
					continue;
				} else {
					count = 0;
					if(touchNo == 0){
						touchNo = Integer.parseInt(br.readLine());
						count++;
						continue;
						
					} else {
						if(count != touchNo){
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
