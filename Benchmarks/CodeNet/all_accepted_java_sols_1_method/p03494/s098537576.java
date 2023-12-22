import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean key = true;
		int count = 0;
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			int add = sc.nextInt();
			list[i] = add;
		}
		out : while (key) {
			for (int i = 0; i < list.length; i++) {
				if (list[i]%2 == 0) {
					list[i] /= 2;
				} else {
					key = false;
					break out;
				}
			}
			count++;
		}
		System.out.println(count);
	}	
}