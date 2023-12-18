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
	if(j<10)
	sum[0]++;
	else if(j<20)	
	sum[1]++;
	else if(j<30)	
	sum[2]++;
	else if(j<40)	
	sum[3]++;
	else if(j<50)	
	sum[4]++;
	else if(j<60)	
	sum[5]++;
	else	
	sum[6]++;
	}
	for(int i=0; i<7; i++)	
	System.out.println(sum[i]);
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}