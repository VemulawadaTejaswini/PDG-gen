import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = 0;
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("R")) {
				count++;
			} else {
				max = Math.max(max,count);
				count=0;
			}
		}
		System.out.println(max);
	}
}