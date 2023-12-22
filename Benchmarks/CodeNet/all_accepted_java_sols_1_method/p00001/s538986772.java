import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[])throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int num[]=new int[10];	 
	for(int i=0;i<10;i++){
	  num[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(num);
	for(int j=9;j>6;j--){
	System.out.println(num[j]);
	}
}}