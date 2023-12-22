import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main (String[] args){

	int[] data = new int[3];
	int[] MAX = new int[3];
	int max = 0;
	int tmp = 0;
	Scanner sc = new Scanner (System.in);
		data[0]=sc.nextInt();
		data[1]=sc.nextInt();
		data[2]=sc.nextInt();

	MAX[0] = data[0]*10 + data[1] + data[2];
	MAX[1] = data[0] + data[1]*10 + data[2];
	MAX[2] = data[0] + data[1] + data[2]*10;

	for(int i = 0; i < MAX.length; i++)
		max = Math.max(max,MAX[i]);

		System.out.println(max);

  }

}