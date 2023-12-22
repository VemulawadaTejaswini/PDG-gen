import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] array = new int[a];
		int w1 = 0;
		int w2 = 0;
		int min = 0;
		int flag = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j <= i; j++) {
				w1 += array[j];
			}
			for(int j = array.length - 1; j > i; j--) {
				w2 += array[j];
			}
			if(flag == 0) {
				min = Math.abs(w1 - w2);
				flag = 1;
			}else if(Math.abs(w1 - w2) < min) {
				min = Math.abs(w1 - w2);
			}
			w1 = 0;
			w2 = 0;
		}
		System.out.println(min);
	}
}