import java.util.Scanner;
public class Main {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		char []t = s.toCharArray();
		int max = 0;
		int count = 0;
		for(int i = 0; i < n ; i++) {
			if(t[i] == 'I') {
				count++;
				max = Math.max(count, max);
			}
			if(t[i] == 'D') {
				count--;
			}
		}
		System.out.println(max);
	}

}
