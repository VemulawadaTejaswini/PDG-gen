import java.util.*;

public class Main{
	   public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			int[] num = new int[6];
			for(int i=0; i<6; i++){ //各6面の整数
				num[i] = scan.nextInt();
			}
			dice d = new dice(num);
			char[] b = scan.next().toCharArray(); //"S","N","W","E"を入力
			for(char ch: b){
				d.roll(ch);
			}
			System.out.println(d.Top()); //結果
	    }
	}

	class dice{
		int[] dice;
		public dice(int[] a){
			dice = new int[6];
			for(int i=0; i<6; i++){
				dice[i] = a[i];
			}
		}
		public void roll(char c){
			int tmp = 0;
			switch(c){
				case 'N':
					tmp = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[4];
					dice[4] = tmp;
					break;
				case 'W':
					tmp = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[3];
					dice[3] = tmp;
					break;
				case 'S':
					tmp = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[1];
					dice[1] = tmp;
					break;
				case 'E':
					tmp = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[2];
					dice[2] = tmp;
					break;
			}
		}
		public int Top(){
			return dice[0];  //上面の整数を戻り値として設定
		}
	}

