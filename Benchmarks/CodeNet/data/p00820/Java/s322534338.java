import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	int t = 1<<15;
	int[] num = new int[t+1];
	for(int i=1; i*i<=t; i++){
	    num[i*i]++;
	    for(int j=i; i*i+j*j<=t; j++){
		num[i*i+j*j]++;
		for(int k=j; i*i+j*j+k*k<=t; k++){
		    num[i*i+j*j+k*k]++;
		    for(int l=k; i*i+j*j+k*k+l*l<=t; l++){
			num[i*i+j*j+k*k+l*l]++;
		    }
		}
	    }
	}
	try {
	    while(true){
		int n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		System.out.println(num[n]);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}