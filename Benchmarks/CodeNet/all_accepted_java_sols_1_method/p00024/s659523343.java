import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String line;
	while((line=br.readLine())!=null){
	    double v = Double.parseDouble(line);
	    double t = v/9.8;
	    double y = 4.9*t*t;
	    boolean flag=true;
	    int n=1;
	    while(flag){
		int l = 5*n-5;
		if(l>=y){
		    flag =false;
		    System.out.println(n);
		}
		n++;
	    }
	}
    }
}