import java.util.Scanner;

 class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
		for(int i = 1 ; i <= n ; i++) {
			String s = Integer.toString(i);
			if(s.length() % 2 != 0) {
				count++;
			}else {
				i = (i*10)-1 ;
			}
		}
		System.out.println(count);
	}
}
