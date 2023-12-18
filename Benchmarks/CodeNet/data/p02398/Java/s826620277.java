import java.util.Scanner;
public class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println(""+countDivisors(scan.nextInt(),scan.nextInt(),scan.nextInt()));
	}
	
	static int countDivisors(int first, int last, int num){
		int count = 0;
		for(int i=first; i<=last; i++)
			if(num%i==0)
				count++;
		return count;
	}
}