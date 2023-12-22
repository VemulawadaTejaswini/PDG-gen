import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] ballInfo = new int[n];
		for(int i = 0;i < n;i++) {
			ballInfo[i] = sc.nextInt();
		}
		Arrays.sort(ballInfo);
		int ballTypeCount = 0;
		int ballCount = 0;
		List<Integer> ballTypeCountInfo = new ArrayList<Integer>();
		for(int i =0;i <n;i++) {
			if(i ==0) {
				ballCount++;
				continue;
			}
			if(ballInfo[i] == ballInfo[i-1]) {
				ballCount++;
			}else {
				ballTypeCountInfo.add(ballCount);
				ballCount =1;
				ballTypeCount++;
			}
			if(i == n -1) {
				ballTypeCountInfo.add(ballCount);
				ballTypeCount++;
			}
		}
		Collections.sort(ballTypeCountInfo);
		int answer = 0;
		int i = 0;
		while(ballTypeCount > k) {
			answer += ballTypeCountInfo.get(i);
			ballTypeCount--;
			i++;
		}

		System.out.println(answer);
	}
}