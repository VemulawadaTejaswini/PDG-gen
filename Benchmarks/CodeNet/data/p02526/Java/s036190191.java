import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int p, y, t = sc.nextInt(), count=0;
	int[] x = new int[100001];
	
	for(int i=0; i<t; i++){
	    p=sc.nextInt();
	    x[p]=1;
	}
	int pp = sc.nextInt();
	for(int i=0; i<pp; i++){
	    p=sc.nextInt();
	    if(x[p]==1)
		count++;
	}
	System.out.println(count);
    }
}