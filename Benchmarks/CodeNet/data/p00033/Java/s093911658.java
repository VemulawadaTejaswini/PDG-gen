import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int count = 0;
	static Pair pair;
	static int num[][]=new int[100][10];

	public static void main(String[] args) {
		read();
		pair = new Pair(0, 0);
		for (int i = 0; i < n; i++) {
			dfs(i,0);
		}

	}
	public static void read(){
		n = sc.nextInt();
		for(int i = 0;i<n;i++){
			for(int j=0;j<10;j++){
				num[i][j]=sc.nextInt();
			}
		}
	}
	public static void dfs(int i,int j) {
		if (count >= 10) {
			System.out.println("YES");
			init();
			return;
		}
		count++;

		int nextNum = num[i][j];
		//?????£?????????????????????
		if (nextNum < pair.left && nextNum < pair.right) {
			System.out.println("NO");
			init();
			return;
		}
		
		//?????£????????\???
		if (nextNum > pair.left && nextNum > pair.right) {
			// ?????????????°???????
			if (nextNum - pair.left <= nextNum - pair.right) {
				pair.left = nextNum;
				dfs(i,++j);
				return;
			} else {
				// ????????????????????°????????£??????
				pair.right = nextNum;
				dfs(i,++j);
				return;
			}
		}
		// ?????£??????????????\?????????
		if (nextNum < pair.left || nextNum < pair.right) {
			if (nextNum > pair.left) {
				pair.left = nextNum;
				dfs(i,++j);
				return;
			} else {
				pair.right = nextNum;
				dfs(i,++j);
				return;
			}
		}

	}

	public static void init() {
		count = 0;
		pair.left = 0;
		pair.right = 0;
	}

}

class Pair {
	int left;
	int right;

	Pair(int a, int b) {
		left = a;
		right = b;
	}

}