public class Main{
	public static void main(String[] args){
		//
		String input = new java.util.Scanner(System.in).nextLine();
		String[] words = input.split("\\s");
		int a = Integer.parseInt(words[0]);
		int b = Integer.parseInt(words[1]);
		int c = Integer.parseInt(words[2]);
		if( a < b && b < c ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//
	}
}