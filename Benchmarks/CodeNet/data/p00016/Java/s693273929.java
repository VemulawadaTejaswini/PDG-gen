import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    int d, t=0;
	    double x=0.0, y=0.0, deg;
	    while(true){
		st = sc.readLine();
		if(st.equals("0,0"))
		    break;
		String[] s = st.split(",");
		d = Integer.valueOf(s[0]);
		deg = Math.toRadians(t);
		x += d*Math.sin(deg);
		y += d*Math.cos(deg);
		t += Integer.valueOf(s[1]);
	    }
	    System.out.printf("%d\n%d\n",(int)x,(int)y);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}