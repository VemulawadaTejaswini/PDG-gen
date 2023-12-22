import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int [] array = new int[10];
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort( array );
        for ( int i = 9 ; i > 6 ; i-- ) {
            System.out.println(array[i]);
        }
	}
}