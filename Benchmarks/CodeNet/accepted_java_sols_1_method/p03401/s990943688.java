import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		int[] map = new int[N + 2];
		map[0] = 0;
		map[N + 1] = 0;
		
		for (int i = 1; i <= N; i++) {
			map[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 1; i < map.length; i++) {
			sum += Math.abs(map[i - 1] - map[i]);
		}
		
		for (int i = 1; i < (map.length - 1); i++) {
			int sub = Math.abs(map[i - 1] - map[i]);
			sub += Math.abs(map[i] - map[i + 1]);
			int add = Math.abs(map[i - 1] - map[i + 1]);
			System.out.println(sum - sub + add);
		}
	}
	
}