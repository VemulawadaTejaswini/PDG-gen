import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	int inputN = sc.nextInt();
	int inputD = sc.nextInt();
	int count = 0;

	for(int i = 0; i < inputN; i++) {
		int xi = sc.nextInt();
		int yi = sc.nextInt();

		int xixi = xi * xi;
		int yiyi = yi * yi;

		int root = xixi + yiyi;
		System.out.println("root:"+root);

		if(Math.sqrt(root) <= inputD) {
			count++;
		}
	}
	System.out.println(count);
}
}
