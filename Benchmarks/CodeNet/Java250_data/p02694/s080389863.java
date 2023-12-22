import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = 100;
		int c = 1;
		for(;;) {
			b += b/100;
			if(a <= b) break;
			c++;
		}
		System.out.println(c);
	}
}