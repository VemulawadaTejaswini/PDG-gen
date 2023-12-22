public class Main {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine(); 
		String[] input2 = input.split(" ");
		int a = Integer.parseInt(input2[0]);
		int b = Integer.parseInt(input2[1]);
		if(a < b)
		{
			System.out.println("a < b");
		}
		else if(a > b)
		{
			System.out.println("a > b");
		}
		else
		{
			System.out.println("a == b");
		}
	}
}