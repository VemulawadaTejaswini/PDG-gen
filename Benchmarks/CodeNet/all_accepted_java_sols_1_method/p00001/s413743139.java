import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] x = new int[10];
	for(int i=0; i<10; i++)
	    x[i]=sc.nextInt();
	Arrays.sort(x);
	System.out.printf("%d\n%d\n%d\n",x[9],x[8],x[7]);
    }
}