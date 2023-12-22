import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int y, t = sc.nextInt(), count=0;
	int[] x = new int[10000000];
	
	for(int i=0; i<t; i++)
	    x[sc.nextInt()]=1;
	
	int p = sc.nextInt();
	for(int i=0; i<p; i++)
	    if(x[sc.nextInt()]==1)
		count++;
	
	System.out.println(count);
    }
}