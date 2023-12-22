import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stu = new int[n];
		int[] res = new int[n];
		for(int i = 0; i < n; i++){
			stu[i] = sc.nextInt();
		}
		for(int i = 0; i < n;i++){
			res[stu[i] - 1]= i + 1;
		}
		for(int i: res){
			System.out.print(i + " ");
		}
	}
}