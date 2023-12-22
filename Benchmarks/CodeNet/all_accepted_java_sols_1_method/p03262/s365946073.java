import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int startPoint = sc.nextInt();
		
		int[] distance = new int[num];
		int count = 0;
		while (sc.hasNextInt()) {
			distance[count] = Math.abs(startPoint - sc.nextInt());
			count++;
		}
		sc.close();
		
		int tmp,ans = 0;
		if (num > 1) {
			for (int i=0; i<num-1; i++) {
				while ((tmp = distance[i] % distance[i+1]) != 0) {
					distance[i] = distance[i+1];
					distance[i+1] = tmp;
				}
				ans = distance[i+1];
			}
		} else if (num == 1) {
			ans = distance[0];
		}
		System.out.println(ans);
	}
}