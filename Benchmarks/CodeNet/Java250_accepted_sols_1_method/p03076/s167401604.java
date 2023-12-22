import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] x = new int[5];
		int y = 10;
		int sum = -10;
		for(int i = 0;i<5;i++) {
			x[i]=scn.nextInt()-1;
			if(x[i]%10<y) {
				y=x[i]%10+1;
			}
			x[i] = x[i]/10+1;
		}
		for(int z:x) {
			sum+=10*z;
		}
		sum+=y;
		System.out.println(sum);
		scn.close();
	}
}