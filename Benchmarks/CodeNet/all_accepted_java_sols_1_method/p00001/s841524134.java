import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] hight;
		hight = new int[10];
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++)
		{
			hight[i] = sc.nextInt();
		}
		
		Arrays.sort(hight);
		
		System.out.println(hight[9]);
		System.out.println(hight[8]);
		System.out.println(hight[7]);
	}

}