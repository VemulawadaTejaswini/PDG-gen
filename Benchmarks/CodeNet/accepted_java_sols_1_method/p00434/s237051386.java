import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[30];
		int[] flag = new int[30];
		
		for(int i = 0; i < 30; i++) {
			num[i] = i + 1;
		}
		
		int tmp;
		
		for(int i = 0; i < 28; i++) {
			tmp = sc.nextInt();
			
			flag[tmp - 1] = 1;
		}
		
		int cnt = 0;
		
		for(int i = 0; i < 30; i++) {
			if(flag[i] == 0) {
				System.out.println(num[i]);
				
				cnt++;
			}
			
			if(cnt == 2) {
				break;
			}
		}
	}
}