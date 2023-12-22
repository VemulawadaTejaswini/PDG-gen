import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    	int high[]=new int[10];
        for(int i=0; i<10; i++){
    	 high[i]=sc.nextInt();	
    	}
	Arrays.sort(high);
	for(int i=9; i>6; i-- ) System.out.println(high[i]);
	}
	}