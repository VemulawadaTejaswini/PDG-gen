import java.lang.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int r;
	boolean flag = true;
	double x=0,y=0,theta=0;
	String stL= br.readLine();
	String[] st =stL.split(",");
	r = Integer.parseInt(st[0]);
	if("0".equals(st[0])&&"0".equals(st[1]))
	    flag=false;
	while(flag){
	    x+=r*(Math.cos(theta));
	    y+=r*(Math.sin(theta));
	    theta+=Math.toRadians(Integer.parseInt(st[1]));
	    stL =br.readLine();
	    st = stL.split(",");
	    r=Integer.parseInt(st[0]);
	    if("0".equals(st[0])&&"0".equals(st[1]))
		flag=false;
	    
	}
	System.out.println((int)y);
	System.out.println((int)x);
    }
}