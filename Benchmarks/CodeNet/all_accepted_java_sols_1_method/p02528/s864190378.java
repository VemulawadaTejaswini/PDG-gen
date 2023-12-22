import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	int t;
	Scanner sc = new Scanner(System.in);
	t = sc.nextInt();
	int[] x = new int[t];
	for(int i=0; i<t; i++)
	    x[i]=sc.nextInt();
	Arrays.sort(x);
	for(int i=0; i<t-1; i++)
	    System.out.print(x[i]+" ");
	System.out.println(x[t-1]);
    }
}