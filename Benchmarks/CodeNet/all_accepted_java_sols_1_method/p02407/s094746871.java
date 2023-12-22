import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int array[] = new int[num];
			
			for(int i = 0; i < num; i++) {
				array[i] = sc.nextInt();
			}
			
			for(int i = num-1;i >= 0; i--) {
				System.out.printf("%d", array[i]);
				if(i != 0) {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
			sc.close();
			
		}
}
