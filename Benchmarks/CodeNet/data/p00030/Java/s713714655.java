import java.util.Scanner;


class Main {
	public static int n;
	public static int s;
	public static int c;

	public static void dfs(int k, int rest, int x){
		if(k == n){
			c += rest == 0 ? 1 : 0;
			return;
		}
		if(rest<0)return;
		for(int i=Math.min(x, 9); i >= 0; i--){
			dfs(k+1, rest-i, i-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextInt();
			s = scan.nextInt();
			if(n == 0 && s == 0)break;
			c = 0;
			dfs(0, s, s);
			System.out.println(c);
		}
	}
}