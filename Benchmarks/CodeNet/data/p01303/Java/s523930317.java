import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int rept = in.nextInt();
		while(rept-- > 0){
			int x1 = in.nextInt(), y1 = in.nextInt(), x2 = x1 + in.nextInt(), y2 = y1 + in.nextInt();
			int n = in.nextInt();
			int ans = 0;
			while(n-- > 0){
				int x = in.nextInt(), y = in.nextInt();
				if(x1<=x && x<=x2 && y1<=y && y<=y2) ans++;
			}
			System.out.println(ans);
		}
	}
}