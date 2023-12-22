import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{  
	
 	public static final Scanner in =new Scanner(System.in);
 	public static void main(String args []){

 			int a [] = new int [3];
 			 a[0] = in.nextInt();
 			  a[1] = in.nextInt();
 			   a[2] = in.nextInt();
 			  int temp = a[0];
 			  a[0]=a[1];
 			  a[1]=temp;
 			  int tem = a[2];
 			  a[2]=a[0];
 			  a[0]=tem;
 			  System.out.print(a[0]+" "+a[1]+" "+a[2]);
 		
 	}


}