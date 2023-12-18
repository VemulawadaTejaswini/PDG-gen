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
			int ansx = -1, ansy = -1;
			for(int i = 1; ; i++){
				for(int j = 0; j <= i; j++){
					int x = j;
					int y = i - j;
					if(a * x + b * y == c){
						flg = true;
						ansx = x;
						ansy = y;
						break;
					}
					else if(a * x == b * y + c){
						flg = true;
						ansx = x;
						ansy = y;
						break;
					}
					else if(b * y == a * x + c){
						flg = true;
						ansx = x;
						ansy = y;
						break;
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