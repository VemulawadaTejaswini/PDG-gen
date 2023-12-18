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
			int[] a = new int[7];
			for(int i = 0; i < n;i++){
				int d = cin.nextInt();
				d /= 10;
				if(d > 6){
					d = 6;
				}
				a[d]++;
			}
			for(int i = 0; i < a.length;i++){
				System.out.println(a[i]);
			}
		}
	}

}