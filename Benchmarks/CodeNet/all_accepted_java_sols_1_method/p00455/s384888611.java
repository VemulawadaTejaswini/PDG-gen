import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int[] array = new int[6];
	    int[] arr = new int[3];

	    StringTokenizer str;
	    
	    for(int i=0; i<3; i++){
		str = new StringTokenizer(br.readLine());
		int j=0;
		while(str.hasMoreTokens()){
		    array[j] = Integer.valueOf(str.nextToken());
		    j++;
		}
		arr[i] = 60*60*array[3]+60*array[4]+array[5] - 60*60*array[0]-60*array[1]-array[2];
	    }
	    
	    for(int i=0; i<3; i++){
		System.out.println(arr[i]/3600+" "+(arr[i]%3600)/60+" "+(arr[i]%60));
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}