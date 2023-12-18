import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    int N;
	    while((N = Integer.valueOf(sc.readLine()))!=0){
		char[] message = sc.readLine().toCharArray();
		int[] a, b;
		a = new int[N];
		b = new int[N];
		for(int i=0; i<N; i++){
		    String[] sp = sc.readLine().split(" ");
		    a[i] = Integer.valueOf(sp[0]);
		    b[i] = Integer.valueOf(sp[1]);
		}
		for(int i=N-1; i>=0; i--){
		    int sabun = b[i]-a[i];
		    char t;
		    message[a[i]-1] += sabun;
		    if(message[a[i]-1] > 'z')
			message[a[i]-1] -= 26;
		    message[b[i]-1] += sabun;
		    if(message[b[i]-1] > 'z')
			message[b[i]-1] -= 26;
		    t = message[a[i]-1];
		    message[a[i]-1] = message[b[i]-1];
		    message[b[i]-1] = t;
		}
		StringBuilder bb = new StringBuilder();
		for(int i=0; i<message.length; i++)
		    bb.append(message[i]);
		System.out.println(bb.toString());
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}