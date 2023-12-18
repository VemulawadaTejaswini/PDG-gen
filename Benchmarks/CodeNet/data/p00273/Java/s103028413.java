import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int nkin,pkin,nmai,pmai,cnt;
	double nkei,pkei,karikei,warikei;
	int niti = sc.nextInt();
	int[] goukei = new int[niti];
	
	public void sinnnotikara(){
		for(cnt = 0;cnt <= niti-1;cnt++){
			goukei[cnt] = 0;
			nkin = sc.nextInt();
			pkin = sc.nextInt();
			nmai = sc.nextInt();
			pmai = sc.nextInt();
			nkei = nkin * 5 * 0.8;
			pkei = pkin * 2 * 0.8;
			karikei = nkin * nmai + pkin * pmai;
			warikei = nkei + pkei;
			
			if(karikei>warikei){
				if(nmai < 5){
					nmai = 5;
					nkei = nkin * nmai * 0.8;
					pkei = pkin * pmai * 0.8;
				}else if(pmai <= 2){
					pmai = 2;
					nkei = nkin * nmai * 0.8;
					pkei = pkin * pmai * 0.8;
					}else{
						nkei = nkin * nmai * 0.8;
						pkei = pkin * pmai * 0.8;
					}
				int nkei2 = (int)nkei;
				int pkei2 = (int)pkei;
				goukei[cnt] = nkei2 + pkei2;
			}else{
				int karikei2 = (int)karikei;
				goukei[cnt] = karikei2;
			}
		}
		for(cnt = 0;cnt <= niti-1;cnt++){
			System.out.println(goukei[cnt]);
		}
	}
			
			
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main YO = new Main();
		YO.sinnnotikara();
	}
}