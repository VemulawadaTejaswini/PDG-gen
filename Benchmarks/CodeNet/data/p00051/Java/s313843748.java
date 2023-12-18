import static java.util.Arrays.*;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n--!=0){
			double min = 0;
			double max = 0;
			double ans = 0;

			char[] c = sc.next().toCharArray();
			sort(c);

			for(int i = 0;i < c.length;i++){
				min = min + c[i] * Math.pow(10, c.length-1-i);
				max = max + c[i] * Math.pow(10, i);
			}
			ans = max -min;
			System.out.println(ans);
		}
	}
}