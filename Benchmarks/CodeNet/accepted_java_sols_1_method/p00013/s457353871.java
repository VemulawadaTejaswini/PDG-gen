import java.util.Scanner;


public class Main{
	public static void main(String[] args){

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i=0;
		int[] stack = new int[10];
		while(sc.hasNext())
		{
			int line = sc.nextInt();

			if(line == 0){
				i--;
				System.out.println(stack[i]);
			}
			else{
				stack[i] = line;
				i++;
			}
		}
	}
}