import java.io.*;
import java.util.*;

class Main{
    static int sum, b;
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(true){
		String[] st = sc.readLine().split(" ");
		int a;
		a = Integer.valueOf(st[0]);
		b = Integer.valueOf(st[1]);
		if(a==0 && b==0)
		    break;
		sum = 0;
		calc(0, a, 0);
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    
    static void calc(int i, int j, int k) throws Exception{
	if(j==0){
	    if(k==b)
		sum++;
	    return;
	}
	for(int l=i; l<=9; l++)
	    calc(l+1, j-1, k+l);
    }
}