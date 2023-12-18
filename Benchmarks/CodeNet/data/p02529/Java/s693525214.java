import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt(), count=0;
	int[] x = new int[t];
	
	for(int i=0; i<t; i++)
	    x[i]=sc.nextInt();
	Arrays.sort(x);

	int p = sc.nextInt();
	int[] y = new int[p];
	for(int i=0; i<p; i++)
	    y[i]=sc.nextInt();
	Arrays.sort(y);
	for(int i=0; i<p; i++)
	    for(int j=i; j<t; j++)
		if(y[i]==x[j]){
		    count++;
		    break;
		}
	System.out.println(count);
    }
}