import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[3];
		int res;
		
		for(int i=0; i<ary.length; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(ary);
		
		res = Math.abs(ary[0] - ary[1]);
		res += Math.abs(ary[1] - ary[2]);
		
		System.out.println(res);
	}

}