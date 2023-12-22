import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		if (r - l >= 2019) {
			System.out.println(0);
		} else {
			int min = 2019;
			for (int i = l % 2019; i <= l % 2019 + (r - l); i++) {
				for (int j = i + 1; j <= l % 2019 + (r - l); j++) {
					min = Math.min(min, i * j % 2019);
				}
			}
			System.out.println(min);
		}
	}
}