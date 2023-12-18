import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		int input = Integer.parseInt(temp[0]);
		int longs = Integer.parseInt(temp[1])-1;
		int[] treesHeight = new int[input];
		for(int i=0;i<input;i++)
		{
			int trees = sc.nextInt();
			treesHeight[i] = trees;
		}
		Arrays.sort(treesHeight);
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<treesHeight.length-longs;i++)
		{
			int tempLagi = treesHeight[i+longs] - treesHeight[i];
			if(tempLagi< min)
				min = tempLagi;
		}
		
		System.out.print(min);
	}
}
