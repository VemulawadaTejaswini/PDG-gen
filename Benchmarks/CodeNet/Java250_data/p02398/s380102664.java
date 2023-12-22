import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		int a=0,b=0,c=0;
		int count = 0;

		while(bl){
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();

			if((a >= 1 && a <= 10000) && (b >= 1 && b <= 10000) && (c >= 1 && c <= 10000) && (a <= b)){
				break;
			}
		}
		while(a <= b){
			if(c % a == 0){
				count++;
			}
			a++;
		}
		System.out.println(count);
	}
}