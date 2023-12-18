import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    int sum = 0, wa = 0;
	    while((st=sc.readLine())!=null){
		String[] a = st.split(",");
		sum += Integer.valueOf(a[0])*Integer.valueOf(a[1]);
		wa += Integer.valueOf(a[0]);
	    }
	    System.out.printf("%d\n%d\n",sum,(int)((double)sum/(double)wa+0.5));
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}