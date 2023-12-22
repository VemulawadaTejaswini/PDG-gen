import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Random ra=new Random();
	
	int[] a = new int[10];
	
	for(int i=0;i<10;i++)
		a[i]=sc.nextInt();
	Arrays.sort(a);

	for(int i = 9 ; i > 6 ; i--){
	    System.out.println(a[i]);
 	}
	}
	}