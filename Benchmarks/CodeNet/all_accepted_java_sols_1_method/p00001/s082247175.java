import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String args[]){
		int in[]=new int[10];
		for(int i=0;i<10;i++)
			in[i]=s.nextInt();
		Arrays.sort(in);
		System.out.println(in[9]);
		System.out.println(in[8]);
		System.out.println(in[7]);
	}
}