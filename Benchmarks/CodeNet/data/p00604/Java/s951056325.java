import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = sc.readLine().split(" ");
		int[] ans = new int[sp.length];
		for(int i=0; i<sp.length; i++)
		    ans[i] = Integer.valueOf(sp[i]);
		Arrays.sort(ans);
		int sum = 0;
		for(int i : ans)
		    sum+=i;
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}