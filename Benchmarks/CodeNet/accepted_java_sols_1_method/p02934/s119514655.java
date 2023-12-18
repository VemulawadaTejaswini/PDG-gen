import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args){
    
    		Scanner sc = new Scanner(System.in);
      		int n = sc.nextInt();
      		float sum = 0;
      		for(int i=0;i<n;i++){
            
            	float x = sc.nextFloat();
            	
            	sum += (1/x);
            }
    		System.out.println(1/sum);
    
    }



}