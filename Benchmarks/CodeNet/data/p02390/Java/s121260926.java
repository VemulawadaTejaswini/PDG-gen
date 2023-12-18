public class Main{
	public static void main(String[] args){
		//
		String input = new java.util.Scanner(System.in).nextLine();
		int sec = Integer.parseInt(input);
		int h = sec / 3600;
		int m = (sec % 3600) / 60; 
		int s = (sec % 3600) % 60; 
		System.out.println( h + ":" + m + ":" + s );
		//
	}
}