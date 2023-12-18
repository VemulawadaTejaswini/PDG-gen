import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[6];
	while(sc.hasNext()){
	    for(int i=0; i<6; i++)
		a[i]=sc.nextInt();
	    System.out.printf("%.3f %.3f\n", (double)Math.abs((a[2]*a[4]-a[1]*a[5])/(a[0]*a[4]-a[1]*a[3])), (double)Math.abs((a[2]*a[3]-a[0]*a[5])/(a[1]*a[3]-a[0]*a[4])));
	}
    }
}