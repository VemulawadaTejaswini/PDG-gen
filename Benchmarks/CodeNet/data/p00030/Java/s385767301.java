import java.util.Scanner;
public class Main {
	public static int dfs(int total, int addv, int target, int n){ return n == 0 ? total == target ? 1 : 0 : addv > 9 ? 0 : dfs(total + addv, addv + 1, target, n - 1) + dfs(total, addv + 1, target, n); }
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(true){ int n = sc.nextInt(), s = sc.nextInt(); if(n == 0 && s == 0) break; System.out.println(dfs(0, 0, s, n)); }
		}
	}
}