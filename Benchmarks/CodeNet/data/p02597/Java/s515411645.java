import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s=sc.next();
       char a[]=s.toCharArray();
       int w=0,r=0;
       for(int i=0;i<n/2;i++){
          if(a[i]=='W'){
          	w++;
          }       	
       }
       for(int i=(n/2);i<n;i++){
       	if(a[i]=='R')
       	r++;

       }

       if(w<=r){
       	System.out.println(w);

       }
       else if(w>r){
       	System.out.println(r+(w-r));
       }
	}
}
