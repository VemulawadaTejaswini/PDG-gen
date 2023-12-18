import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int cnt,hantei,cnt2 = 0;
	int syurui = sc.nextInt();
	int[] kosuu = new int[syurui];
	int[] inji = new int [100];

	public void challenge(){
		while(syurui != 0){
			int [] kosuu = new int[syurui];
			for(cnt = 0;cnt <= syurui-1;cnt++){
				kosuu[cnt] = sc.nextInt();
			}
			hantei = 0;
			for(cnt = 0;cnt <= syurui-1;cnt++){
				if(kosuu[cnt] <= 1){
					hantei++;
				}
			}
				if(hantei == syurui){
					inji[cnt2] = 0;
				}else{
					inji[cnt2] = syurui + 1;
				}
			for(cnt = 0;cnt <= syurui-1;cnt++){
				kosuu[cnt] = 0;
			}
			cnt2++;
			syurui = sc.nextInt();
		}
	}

	public void mezamenotoki(){
		int[] inji2 = new int [cnt2];
		for(cnt = 0;cnt <= cnt2-1;cnt++){
			inji2[cnt] = inji[cnt];
		}
		for(cnt = 0;cnt <= inji2.length-1;cnt++){
			if(inji2[cnt] == 0){
				System.out.println("NA");
			}else{
				System.out.println(inji[cnt]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main YO = new Main();
		YO.challenge();
		YO.mezamenotoki();
	}

}