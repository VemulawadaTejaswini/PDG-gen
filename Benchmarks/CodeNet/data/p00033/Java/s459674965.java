import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=0; i<n; i++){
		String[] ball = sc.readLine().split(" ");
		int[] sap = new int[10];
		for(int j=0; j<10; j++)
		    sap[j] = Integer.valueOf(ball[j]);
		int max = sap[0], min=0;
		String out = "YES";
		for(int j=1; j<10; j++){
		    if(sap[j]>max)
			max = sap[j];
		    else if(sap[j]<max)
			if(sap[j]<min){
			    out = "NO";
			    break;
			}
			else
			    min = sap[j];
		}
		System.out.println(out);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}