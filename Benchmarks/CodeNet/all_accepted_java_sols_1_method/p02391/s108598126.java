public class Main{
	public static void main(String[] args){
		//
		String input = new java.util.Scanner(System.in).nextLine();
		String[] words = input.split("\\s");
		int a = Integer.parseInt(words[0]);
		int b = Integer.parseInt(words[1]);
		if( a > b ){
			System.out.println("a > b");
		}else if( a < b ){
			System.out.println("a < b");
		}else if( a == b ){
			System.out.println("a == b");
		}
		//
	}
}