public class Main {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum = a + b + c;
		if( ( sum / a == 2 && sum % a == 0 ) ||
				( sum / b == 2 && sum % b == 0 ) || 
				( sum / c == 2 && sum % c == 0 )){
			System.out.println( "Yes" );
		}else{
			System.out.println( "No" );
		}
	}
}