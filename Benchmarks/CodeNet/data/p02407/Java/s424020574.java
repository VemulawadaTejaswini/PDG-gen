import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 100) {
			int array[] = new int[num];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
				if(0 <= array[i] && array[i] < 1000) {
					for(int j = num; j>0; j--) {
						if(j!=1) {
				            System.out.print(array[j-1]+" ");
				        }else {
				            System.out.println(array[j-1]);
				        }
					}
				}
			}
		}
	}
}