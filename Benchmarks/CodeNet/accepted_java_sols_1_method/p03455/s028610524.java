import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		
		data1 = data1 * data2;
		//偶数
		if(data1 % 2==0){
		    System.out.println("Even");
		}
		//偶数
		else{
		    System.out.println("Odd");
		}
	}
}