import java.util.Scanner;
public class Main {
	static final int BALL_NUM = 10;
	int[] ball;
	void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			//????????????????????????
			ball = new int[BALL_NUM];
			for(int j = 0;j < BALL_NUM;j++)
				ball[j] = scan.nextInt();
			if(solve()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	boolean solve(){
		int b = 0,c = 0;
		for(int i = 0;i < BALL_NUM;i++){
			//??????b>c??¨??????b??????????????????
			//b > ball[i]?????´??????c???ball[i]?????£??\?????????????????¢?????????????????????
			if(b < ball[i]){
				b = ball[i];
			}else{
				if(c < ball[i]){
					c = ball[i];
				}else{
					return false;
				}
			}
			/*
			if(b >= c){
				if(b < ball[i]){
					b = ball[i];
				}else{
					if(c < ball[i]){
						c = ball[i];
					}else{
						return false;
					}
					
				}
			}else{
				if(c < ball[i]){
					c = ball[i];
				}else{
					if(b < ball[i]){
						b = ball[i];
					}else{
						return false;
					}
				}
			}
			*/
		}
		return true;
	}

	public static void main(String args[]){
		new Main().run();
	}
}