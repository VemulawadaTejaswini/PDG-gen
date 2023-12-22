import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int [] list = new int[10];
		int i,j;
		
		for(i=0;i<10;i++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		
		for(j=0;j<3;j++){
			System.out.println(list[9-j]);
		}
	}

}