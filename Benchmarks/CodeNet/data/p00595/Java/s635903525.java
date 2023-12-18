import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int i = 1;
			int[] gcd = new int[2];
			gcd[0] = scan.nextInt();
			gcd[1] = scan.nextInt();
			
			while(i != 0){
				i = gcd[0] % gcd[1];
				gcd[0] = gcd[1];
				gcd[1] = i;
			}
			System.out.println(gcd[0]);
		}
	}
}