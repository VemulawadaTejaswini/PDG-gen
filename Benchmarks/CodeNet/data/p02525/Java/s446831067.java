import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true) {
		double ave = 0, var = 0;
		int n = sc.nextInt();
		if (n == 0) {break;}
		int[] point = new int[n];
		for (int i = 0; i < point.length; i++) {
			point[i] = sc.nextInt();
			ave = ave + point[i] / point.length;
		}
		for (int i = 0; i < point.length; i++) {
			var = var + (point[i] - ave)*(point[i] - ave)/ point.length;
		}
		System.out.println(Math.sqrt(var));
		}
	}
}