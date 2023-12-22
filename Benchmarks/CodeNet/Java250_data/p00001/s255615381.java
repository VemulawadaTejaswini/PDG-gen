import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; ++i){
			arr[i] = scan.nextInt();
			//System.out.println();
		}
		Arrays.sort(arr);
		System.out.println(arr[9]);
		System.out.println(arr[8]);
		System.out.println(arr[7]);
	}
}