import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = s.substring(1).replaceAll("W", "").length();
		int min = count;
		for(int i = 1; i < n; i++) {
			if(s.charAt(i-1) == 'W')
				count++;
			if(s.charAt(i) == 'E')
				count--;
			if(min > count) {
				min = count;
			}
		}
		System.out.println(min);
	}
}