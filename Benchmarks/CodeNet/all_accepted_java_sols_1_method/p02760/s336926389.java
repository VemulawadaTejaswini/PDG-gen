import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] aArray = new int[9];
		for (int i = 0; i < 9; i++) {
			aArray[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] bArray = new int[n];
		for (int j = 0; j < n; j++) {
			bArray[j] = sc.nextInt();
		}
		
		for (int a = 0; a < aArray.length; a++) {
			for (int b = 0; b < bArray.length; b++) {
				if (aArray[a] == bArray[b]) {
					aArray[a] = 0;
				}
			}
		}
		
		for (int k = 0; k < 3; k++) {
			if (aArray[k] == aArray[k + 3] && aArray[k] == aArray[k + 6]) {
				count++;
			} 
		}
		
		for (int m = 0; m < 9; m += 3) {
			if (aArray[m] == aArray[m + 1] && aArray[m] == aArray[m + 2]) {
				count++;
			}
		}
		
		if (aArray[0] == aArray[4] && aArray[0] == aArray[8]) {
			count++;
		} else if(aArray[2] == aArray[4] && aArray[2] == aArray[6]) {
			count++;
		}
		
		System.out.println(count >= 1 ? "Yes" : "No");
	}
}	