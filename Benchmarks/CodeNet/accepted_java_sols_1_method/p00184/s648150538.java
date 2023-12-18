import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	int n = Integer.valueOf(sc.readLine());
	if(n==0) break;
	int[] sum = new int[7];
	for(int i=0; i<n; i++){
	int j = Integer.valueOf(sc.readLine());
	if(j>60) j = 60;
	sum[j/10]++;
	}
	for(int i=0; i<7; i++)	
	System.out.println(sum[i]);
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}