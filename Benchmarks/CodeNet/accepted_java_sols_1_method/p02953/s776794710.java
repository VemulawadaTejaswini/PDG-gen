import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		java.util.Scanner scan = new Scanner(System.in);

		int masu = scan.nextInt();
		long[] height = new long[masu];
		boolean flg = false;
		long max = 0;

		for(int i=0;i<masu;i++) {
			height[i] = scan.nextLong();
		}

		for(int i=0;i<masu-1;i++) {
			max = Math.max(max,height[i]);
			if(height[i] > height[i+1]) {
				if(height[i]-1 > height[i+1] || height[i]-1 !=max-1) {
				flg = true;
				}
			}
		}
		System.out.println(flg?"No":"Yes");
		scan.close();
	}

}
