import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n[] = new int [101];

		int max=0;
		while (scan.hasNext())
			n[scan.nextInt()]++;

		for(int i=1;i<101;i++)
			max =Math.max(max,n[i]);
		for(int i=1;i<101;i++)
			if(n[i] == max)System.out.println(i);

		}


					}