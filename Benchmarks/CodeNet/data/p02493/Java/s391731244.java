import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, i;
		int num[] = new int[101];
		
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num[i] = input.nextInt();
		}
		for (i = n - 1; i > 0; i--){
			System.out.print(num[i] + " ");
		}
		System.out.println(num[0]);
	}
}