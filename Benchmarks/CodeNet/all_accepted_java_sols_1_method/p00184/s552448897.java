import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int[] a = new int[100];
			for(int i = 0; i < n;i++){
				int d = cin.nextInt();
				d /= 10;
				a[d]++;
			}
			for(int i = 0; i < 6;i++){
				System.out.println(a[i]);
			}
			int sum=0;
			for(int i = 6; i < a.length; i++){
				sum += a[i];
			}
			System.out.println(sum);
		}
	}
}