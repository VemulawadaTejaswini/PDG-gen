import java.util.*;
class Main{
	public static void main(String[] args){
		int a , b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		if((a+b)%2 == 0)
			System.out.println((a+b)/2);
		else
			System.out.println("IMPOSSIBLE");

	}
}