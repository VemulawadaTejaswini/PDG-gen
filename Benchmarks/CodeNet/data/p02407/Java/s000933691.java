import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int [n];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			array[i]  =num;
		}

		for (int i = n - 1; i >= 0; i--) {
			if(i == 0){
				System.out.println(array[i]);
			}else{
				System.out.print(array[i] + " ");
			}
		}
		sc.close();

	}
}
