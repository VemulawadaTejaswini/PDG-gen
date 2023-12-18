import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int n = Integer.parseInt(sc.next()), s =Integer.parseInt(sc.next());
				if(n == 0 && s == 0) break;
				System.out.println(dfs(0, 0, s, n));
			}
		}
	}
	public static int dfs(int total, int addval, int target, int n){
		if(n <= 0) return total == target ? 1 : 0;
		else if(addval >= 10) return 0;
		else return dfs(total + addval, addval + 1, target, n - 1) + dfs(total, addval + 1, target, n);
	}
}