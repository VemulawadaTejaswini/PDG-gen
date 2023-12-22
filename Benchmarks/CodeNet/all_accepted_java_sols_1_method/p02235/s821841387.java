import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		for (int num = 0; num < i;num++) 
		{
			int total = 0;			
			String string1 = in.next();
			String string2 = in.next();
			int array[][] = new int[string1.length()+1][string2.length()+1];
			
			
			for(int h = 1;h <= string1.length();h++)
				for(int j = 1; j <= string2.length();j++) 
				{   
					char char1 = string1.charAt(h-1);
					char char2 = string2.charAt(j-1);
					if(char1 == char2) 
						{
						array[h][j] = array[h-1][j-1]+1;
						total  = array[h][j];
						}else {
						array[h][j] = Math.max(array[h][j-1], array[h-1][j]);
						total =	array[h][j];
							  }
				}
		System.out.println(total);
		}
		in.close();

	}

}

