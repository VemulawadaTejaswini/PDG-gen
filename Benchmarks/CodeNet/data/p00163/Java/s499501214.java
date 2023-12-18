import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	int[][] kin,kyori;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		kin = new int[7][7];
		kyori = new int[7][7];
		kin[0][1] = kin[1][0] = 300;kin[0][2] = kin[2][0] = 500;kin[0][3] = kin[3][0] = 600;
		kin[0][4] = kin[4][0] = 700;kin[0][5] = kin[5][0] = 1350;kin[0][6] = kin[6][0] = 1650;
		kin[1][2] = kin[2][1] = 350;kin[1][3] = kin[3][1] = 450;kin[1][4] = kin[4][1] = 600;
		kin[1][5] = kin[5][1] = 1150;kin[1][6] = kin[6][1] = 1500;
		kin[2][3] = kin[3][2] = 250;kin[2][4] = kin[4][2] = 400;
		kin[2][5] = kin[5][2] = 1000;kin[2][6] = kin[6][2] = 1300;
		kin[3][4] = kin[4][3] = 250;kin[3][5] = kin[5][3] = 850;
		kin[3][6] = kin[6][3] = 1300;
		kin[4][5] = kin[5][4] = 600;kin[4][6] = kin[6][4] = 1150;
		kin[5][6] = kin[6][5] = 500;
		
		kyori[0][1] = kyori[1][0] = 6;kyori[0][2] = kyori[2][0] = 13;kyori[0][3] = kyori[3][0] = 18;
		kyori[0][4] = kyori[4][0] = 23;kyori[0][5] = kyori[5][0] = 43;kyori[0][6] = kyori[6][0] = 58;
		kyori[1][2] = kyori[2][1] = 7;kyori[1][3] = kyori[3][1] = 12;
		kyori[1][4] = kyori[4][1] = 17;kyori[1][5] = kyori[5][1] = 37;kyori[1][6] = kyori[6][1] = 52;
		kyori[2][3] = kyori[3][2] = 5;kyori[2][4] = kyori[4][2] = 10;
		kyori[2][5] = kyori[5][2] = 30;kyori[2][6] = kyori[6][2] = 45;
		kyori[3][4] = kyori[4][3] = 5;kyori[3][5] = kyori[5][3] = 25;kyori[3][6] = kyori[6][3] = 40;
		kyori[4][5] = kyori[5][4] = 20;kyori[4][6] = kyori[6][4] = 30;
		kyori[5][6] = kyori[6][5] = 15;
		new AOJ0163().doIt();
	}
	
	class AOJ0163{
		void doIt(){
			while(true){
				int startID = in.nextInt();
				if(startID == 0)return;
				Calc c = new Calc(startID, in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
				System.out.println(c.getResult());
			}
		}
		
		class Calc{
			int StartID,endID,sh,sm,eh,em;
			int time;
			boolean sw;
			public Calc(int _sID,int _sh,int _sm,int _eID,int _eh,int _em) {
				StartID = _sID;sh = _sh;sm = _sm;
				endID = _eID;eh = _eh;em = _em;
				sw = false;
				getTime();
			}
			
			int getResult(){
				int result = kin[StartID-1][endID-1];
				if(sw&&kyori[StartID-1][endID-1]<=40){
					result = result/2;
					if(result%50!=0){
						result+=(50-result%50);
					}
				}
				return result;
			}
			
			void getTime(){
				int stime = sh*60+sm;
				int etime = eh*60+em;
				time = etime-stime;
				if(stime>=1050&&stime<=1170)sw = true;
				if(etime>=1050&&etime<=1170)sw = true;
			}
		}
		
	}
	
}