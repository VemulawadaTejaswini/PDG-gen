import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=0; i<n; i++){
		char[] c = sc.readLine().toCharArray();
		Arrays.sort(c);
		String st = new String(c);
		int min = Integer.valueOf(st);
		st = new StringBuffer(st).reverse().toString();
		int max = Integer.valueOf(st);
		System.out.println(max-min);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}