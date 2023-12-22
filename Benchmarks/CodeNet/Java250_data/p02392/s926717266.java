public class Main {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine(); 
		String[] input2 = input.split(" ");
		int a = Integer.parseInt(input2[0]);
		int b = Integer.parseInt(input2[1]);
		int c = Integer.parseInt(input2[2]);
		if(a < b && b < c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}