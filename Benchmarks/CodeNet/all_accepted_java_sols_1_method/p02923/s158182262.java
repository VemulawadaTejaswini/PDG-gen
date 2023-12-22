import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = 0;
		int workNum = 0;

		int culHeight = sc.nextInt();
		for(int i = 0;i < (n - 1);i++) {
			int nextHeight = sc.nextInt();

			if(culHeight < nextHeight) {
				max = (max < workNum) ? workNum : max;
				workNum = 0;
			}else {
				workNum++;
			}
			culHeight = nextHeight;
		}

		max = (max < workNum) ? workNum : max;
		System.out.println(max);
	}
}