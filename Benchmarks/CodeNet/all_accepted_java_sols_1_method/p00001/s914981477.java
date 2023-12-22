import java.util.Scanner;
import java.util.Arrays;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = new int[10];
		int i;
 
		Scanner cin = new Scanner(System.in);
		for (i = 0; i < 10; i++){
			a[i] = cin.nextInt();
		}
 
		Arrays.sort(a);
 
		for (i = 9; i > 6; i--){
			System.out.println(a[i]);
		}
	}
}