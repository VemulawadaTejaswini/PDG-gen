import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int firstDigit = num%10;
		int lastDigit = num/100;
		
		if(firstDigit == lastDigit)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}