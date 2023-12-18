import java.lang.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String str = br.readLine();
	String[] st = str.split(" ");
	int[] num = new int[5];
	for(int i=0;i<5;i++)
	    num[i]=Integer.parseInt(st[i]);
	for(int i=0;i<5;i++)
	    for(int j=0;j<4;j++)
		if(num[j]<num[j+1]){
		    int t=num[j];
		    num[j]=num[j+1];
		    num[j+1]=t;
		}
	for(int i=0;i<4;i++)
	    System.out.print(num[i]+" ");
	System.out.println(num[4]);
    }
}