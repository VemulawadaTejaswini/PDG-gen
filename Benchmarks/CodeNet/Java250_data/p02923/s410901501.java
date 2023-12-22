import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] height = new int[N];
		int count = 0;
		int anser =0;
		for(int i = 0; i<N;i++) {
			height[i] = sc.nextInt();
		}
		//一つずつ確認して大きければanserに入れる。
		for(int num = 0; num<N-1; num++) {
				if(height[num] >= height[num+1]) {
					count++;
				}else {
					count = 0;
				}
				anser = anser<=count? count:anser;
			}
		System.out.println(anser);
	}
}