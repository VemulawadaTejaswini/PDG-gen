import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] one = new int[N];
		int[] two = new int[N];
		int[] three = new int[N];
		
		for(int i = 0; i < N; i++) {
			one[i] = sc.nextInt();
			two[i] = sc.nextInt();
			three[i] = sc.nextInt();
		}
		
		int[] pointOne = new int[N];
		int[] pointTwo = new int[N];
		int[] pointThree = new int[N];
		
		int flag = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					continue;
				} else if(one[i] == one[j]) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				pointOne[i] = one[i];
			} else {
				pointOne[i] = 0;
			}
			
			flag = 0;
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					continue;
				} else if(two[i] == two[j]) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				pointTwo[i] = two[i];
			} else {
				pointTwo[i] = 0;
			}
			
			flag = 0;
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					continue;
				} else if(three[i] == three[j]) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				pointThree[i] = three[i];
			} else {
				pointThree[i] = 0;
			}
			
			flag = 0;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(pointOne[i] + pointTwo[i] + pointThree[i]);
		}
		
	}
}