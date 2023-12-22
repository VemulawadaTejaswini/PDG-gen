import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	int a=0;
	int b,c;
	
	
	a = in.nextInt();	
	b= in.nextInt();
	c= in.nextInt();
	int[] aa={a,b,c};
	Arrays.sort(aa);
	System.out.println(aa[0]+aa[1]+aa[2]*10);
	}	
}