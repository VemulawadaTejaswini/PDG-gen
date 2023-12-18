import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[6];
	double x, y, p, q;
	while(sc.hasNext()){
	    for(int i=0; i<6; i++)
		a[i]=sc.nextInt();
	    p = (double)(a[2]*a[4]-a[1]*a[5]);
	    q = (double)(a[2]*a[3]-a[0]*a[5]);
	    if(p==0)
		x = 0;
	    else
		x = p/(a[0]*a[4]-a[1]*a[3]);
	    if(q==0)
		y = 0;
	    else
		y = q/(a[1]*a[3]-a[0]*a[4]);
	    System.out.printf("%.3f %.3f\n", x, y);
	}
    }
}