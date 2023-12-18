import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> array = new ArrayList<Integer>();
	ArrayList<Integer> arrayOut = new ArrayList<Integer>();

	try {
	    while(true){
		int i = Integer.valueOf(br.readLine());
		if(i==0)
		    break;
		array.add(i);
	    }
	} catch(Exception e){
	    System.out.println("Error");
	}
	
	for(int i=0; i<array.size(); i++){
	    int k = 0;
	    int ix = 1000-array.get(i);	    
	    while(ix>=500){
		ix-=500;
		k++;
	    }
	    while(ix>=100){
		ix-=100;
		k++;
	    }
	    while(ix>=50){
		ix-=50;
		k++;
	    }
	    while(ix>=10){
		ix-=10;
		k++;
	    }
	    while(ix>=5){
		ix-=5;
		k++;
	    }
	    while(ix>=1){
		ix-=1;
		k++;
	    }
	    
	    arrayOut.add(k);
	}
	
	for(int i=0; i<array.size(); i++)
	    System.out.println(arrayOut.get(i));
	
    }
}