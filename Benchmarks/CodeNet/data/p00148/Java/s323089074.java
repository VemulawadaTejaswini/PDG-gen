import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
         int ans=sc.nextInt()%39;
         if(ans==0)ans=39;
         if(ans<10)System.out.println("3C0"+ans);
         else System.out.println("3C"+ans);
    	}    
	}
	}