import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main (String[] args){

	int A,B,C;
	int[] MAX = new int[3];
	int max = 0;

	Scanner sc = new Scanner (System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();

	MAX[0] = A*10 + B    + C;
	MAX[1] = A    + B*10 + C;
	MAX[2] = A    + B    + C*10;

	for(int i = 0; i < MAX.length; i++)
		max = Math.max(max,MAX[i]);

		System.out.println(max);

	}

}