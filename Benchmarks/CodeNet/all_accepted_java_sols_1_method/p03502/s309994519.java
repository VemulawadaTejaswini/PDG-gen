import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int l = N.length();
		int[] H = new int[l];
		int sum = 0;

		for(int i=0; i<l; i++) {
			H[i] = Character.getNumericValue(N.charAt(i));
			sum += H[i];
		}

		if(Integer.parseInt(N)%sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
