
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		while (true) {
			int judgeCount = sin.nextInt();
			if (judgeCount == 0) break;
			int[] points = new int[judgeCount];
			int point = 0;
			for (int i = 0; i < judgeCount; i++) {
				point += points[i]  = sin.nextInt();
			}
			System.out.println(Math.round((point - max(points) - min(points))/(judgeCount-2)));
		}
	}
	
	private static int max(int[] datas){
		int result = datas[0];
		for (int i : datas) {
			result = Math.max(result, i);
		}
		return result;
	}
	
	private static int min(int[] datas){
		int result = datas[0];
		for (int i : datas) {
			result = Math.min(result, i);
		}
		return result;
	}
	
	
}