import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		byte[] array = new byte[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextByte();
		}
		int count = 0;
		boolean flag = true;
		while(flag) {
			flag = false;
			for (int i = 1; i < array.length; i++) {
				if(array[i] < array[i - 1]){
					swap(array, i, i - 1);
					count++;
					flag = true;
				}
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[array.length - 1]);
		System.out.println(count);
	}
	
	static void swap(byte[] array, int x, int y){
		byte tmp = array[x];
		array[x] = array[y];
		array[y] = tmp;
	}
}
