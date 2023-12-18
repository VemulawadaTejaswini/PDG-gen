import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int num = sc.nextInt();
			int[] num_arr = new int[num];
			
			for(int i = 0; i < num; i++) {
				num_arr[i] = sc.nextInt();
			}
			for(int i = num - 1; i >= 0; i--) {
				System.out.print(num_arr[i]);
				if(i!=0)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
