import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		String s = scan.next();
		int[] sum = new int[n + 1];

		int i;
		for(i = 1; i < n; i++) {
			if(s.substring(i - 1, i + 1).equals("AC")) {
				sum[i] = sum[i - 1] + 1;
			}else {
				sum[i] = sum[i - 1];
			}
		}

		int start,end;
		for(i = 0; i < q; i++) {
			start = scan.nextInt() - 1;
			end = scan.nextInt() - 1;

			System.out.println(sum[end] - sum[start]);
		}
	}
}
