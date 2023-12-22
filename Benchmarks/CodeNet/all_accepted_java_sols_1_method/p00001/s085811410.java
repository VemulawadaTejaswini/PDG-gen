import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int one = 0;
		int two = 0;
		int three = 0;
		
		
		
		for(int i = 0; i < 10; i++) {
			int x = input.nextInt();
			//System.out.println("x = " + x);
			if (x > one) {
				three = two;
				two = one;
				one = x;
			}
			else if (x > two) {
				three = two;
				two = x;
			}
			else if(x > three) {
				three = x;
			}
		}
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}