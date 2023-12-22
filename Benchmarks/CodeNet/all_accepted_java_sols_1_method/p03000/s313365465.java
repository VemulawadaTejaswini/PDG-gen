import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] l = new int[n];

		int i;
		for(i = 0; i < n; i++)
			l[i] = scan.nextInt();

		long sum = 0;
		int cnt = 1;
		for(i = 0; i < n; i++) {
			sum += l[i];
			if(sum > x) {
				break;
			}else {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
