import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		String t;
		
		for(int i = 1; i <= s.length(); i++) {
			t = s.substring(i-1,i);
			if(t.equals(String.valueOf(i % 2))) {
				count ++;
			}
		}
			System.out.println(Math.min(count, s.length() - count));
	}
}