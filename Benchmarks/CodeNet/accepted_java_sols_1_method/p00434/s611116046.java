import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag[] = new boolean[31];
		
		for(int i = 0; i < 28; i++) {
			flag[sc.nextInt()] = true;
		}
		
		for(int i = 1; i <= 30; i++) {
			if (!flag[i]) {
				System.out.println(i);
			}
		}
	}
}