import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	int[] prime = new int[1000000];
	prime[0] = 1; prime[1] = 1;
	for(int i=2; i<1000; i++)
	    if(prime[i]==0)
		for(int j=i*i; j<1000000; j+=i)
		    prime[j]=1;
	try {
	    while(true){
		String[] st = sc.readLine().split(" ");
		int a = Integer.valueOf(st[0]), d = Integer.valueOf(st[1]), n = Integer.valueOf(st[2]);
		if(a==0 && d==0 && n==0)
		    break;
		int check = 0;
		while(check!=n){
		    if(prime[a]==0)
			check++;
		    a+=d;
		}
		System.out.println(a-d);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}