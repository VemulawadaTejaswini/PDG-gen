import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

	Scanner stdIn = new Scanner(System.in);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int a1 = stdIn.nextInt();
	int a2 = stdIn.nextInt();
	int a3 = stdIn.nextInt();

	int min = a1;
	int max = a1;

	if(min > a2)
		min = a2;
	if(min > a3)
		min = a3;

	if(max < a2)
		max = a2;
	if(max < a3)
		max = a3;

	int ans = max - min;
	System.out.println(ans);
		



	}
}