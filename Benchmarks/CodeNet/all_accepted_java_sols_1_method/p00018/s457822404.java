import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for(int i = 4; i >= 0; i--) {
			if(i == 0) {
				System.out.print(num[i]);
			} else {
				System.out.print("" + num[i] + " ");
			}
		}
		System.out.println("");
	}
}