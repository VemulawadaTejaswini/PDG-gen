public class Main {
public static void main(String[] args){
	
	String[] input = new java.util.Scanner ( System.in ). nextLine().split(" ");
	int w = Integer.parseInt(input[0]);
	int h = Integer.parseInt(input[1]);
	int x = Integer.parseInt(input[2]);
	int y = Integer.parseInt(input[3]);
	int r = Integer.parseInt(input[4]);
	
	if (x > 0 && y > 0)
	{
		if ((x + r <= w) && (x >= r))
		{
			if ((y + r <= h) && (y >= r))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No");
	}
	else
		System.out.println("No");


}
}