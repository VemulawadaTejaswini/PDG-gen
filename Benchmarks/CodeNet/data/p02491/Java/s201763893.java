import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		int c = (int)a/(int)b;
	        int d = (int)a%(int)b;

		System.out.print(c+" ");
		System.out.print(d+" ");
		System.out.println(a/b);
	}
}