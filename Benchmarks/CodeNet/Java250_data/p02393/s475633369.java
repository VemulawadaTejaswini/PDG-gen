import java.util.Arrays;

public class Main {
public static void main(String[] args){
	
	String[] input = new java.util.Scanner ( System.in ). nextLine().split(" ");
	int a = Integer.parseInt(input[0]);
	int b = Integer.parseInt(input[1]);
	int c = Integer.parseInt(input[2]);
	int[] an = new int[]{a, b, c};
	Arrays.sort(an);
	for (int i = 0; i < an.length; i++)
	{
		System.out.print(an[i]);
		if (i != 2)
			System.out.print(" ");
		if (i == 2)
			System.out.println();
	}
	
	
	
	
}
}