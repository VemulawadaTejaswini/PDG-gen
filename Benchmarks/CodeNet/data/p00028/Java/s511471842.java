import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{

 
    
    public static void main(String[] args)throws IOException{
	int[] sample = new int[11];
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	String line;
	int x;
	while((line=br.readLine())!=null){
		x=Integer.parseInt(line);
		sample[x]++;
      	
	    }
	 int max=0;
    for(int i =1 ;i<11;i++)
	if(max<sample[i])
	    max=sample[i];
    for(int i =0;i<11;i++)
	if(max==sample[i])
	    System.out.println(i);
    }
}