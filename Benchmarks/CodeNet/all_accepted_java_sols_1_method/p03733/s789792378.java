import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i < n;i++) {
			array[i] = sc.nextInt();
		}
		long answer =0;
		for(int i=0;i < n;i++) {
			if(i == n-1) {
				answer+=t;
				break;
			}
			if(array[i+1]-array[i] >t) {
				answer+=t;
			}else {
				answer+= array[i+1]-array[i];
			}
		}
		System.out.println(answer);
	}
}