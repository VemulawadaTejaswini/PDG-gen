import java.util.Scanner;
public class AOJ1003101 {
	static void search(){
		Scanner sc = new Scanner(System.in);
		int m,n,number = 0;
		m = sc.nextInt();
		int[] num1 = new int[m];
		for(int i = 0; i < m; i++){
			num1[i] = sc.nextInt();
		}
		n = sc.nextInt();
		int[] num2 = new int[n];
		for(int i = 0; i < n; i++){
			num2[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(num1[i] == num2[j]) number++;
			}
		}
		System.out.println(number);
	}
	public static void main(String[] args) {
		search();
	}
}