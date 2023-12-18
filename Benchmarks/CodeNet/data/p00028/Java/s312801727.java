import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
   int data[]=new int[100];
   int m=0;
   while(sc.hasNext()){
	   int n=sc.nextInt()-1;
	   data[n]++;
	   if(m<data[n]) m=data[n];
   }
 for(int i=0; i<data.length; i++){ 
	 if(data[i]==m) System.out.println(i+1);
 }
	}
	}