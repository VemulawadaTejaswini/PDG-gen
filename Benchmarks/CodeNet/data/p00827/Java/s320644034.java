import java.util.*;
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a|b|c) == 0) break;
			boolean flg = false;
			int ansx = -1, ansy = -1, ans = Integer.MAX_VALUE;
			for(int i = 0; ; i++){
				for(int j = 0; j <= i; j++){
					int x = j;
					int y = i - j;
					if(a * x + b * y == c){
						flg = true;
						if(ans > a * x + b * y){
							ans = a * x + b * y;
							ansx = x;
							ansy = y;
						}
					}
					else if(a * x == b * y + c){
						flg = true;
						if(ans > a * x + b * y){
							ans = a * x + b * y;
							ansx = x;
							ansy = y;
						}
					}
					else if(b * y == a * x + c){
						flg = true;
						if(ans > a * x + b * y){
							ans = a * x + b * y;
							ansx = x;
							ansy = y;
						}
					}
				}
				if(flg) break;
			}
			System.out.println(ansx + " " + ansy);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}