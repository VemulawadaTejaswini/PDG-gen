public class Main {
	public static void main(String[] args) {
		int inputSecond	= new java.util.Scanner(System.in).nextInt();
		
		int second	= inputSecond % 60;
		int minute	= inputSecond / 60;
		minute		= minute % 60;
		int hour	= inputSecond / (60*60);
		
		System.out.println( hour + ":" + minute + ":" + second );
	}
}