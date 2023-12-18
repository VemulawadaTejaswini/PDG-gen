import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int n = sc.nextInt(), s = sc.nextInt();
				if(n == 0 && s == 0) break;
				System.out.println(dfs(0, 0, s, n));
			}
		}
	}
	public static int dfs(int total, int addv, int target, int n){
		if(n == 0) return total == target ? 1 : 0;
		else if(total > target || addv > 9) return 0;
		else return dfs(total + addv, addv + 1, target, n - 1) + dfs(total, addv + 1, target, n);
	}
}