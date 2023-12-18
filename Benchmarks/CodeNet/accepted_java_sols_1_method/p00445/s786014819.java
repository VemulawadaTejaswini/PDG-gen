import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	int[] flag = new int['Z'+1];
	int oi = 0;
	try{
	    while(null!=(line = br.readLine())){
		line = 'A' + line;
		while((oi = line.indexOf("OI")) != -1){
		    flag[line.charAt(oi-1)]++;
		    line = line.substring(oi + 1);
		}
		System.out.println(Integer.toString(flag['J']));
		System.out.println(Integer.toString(flag['I']));
		flag['J'] = flag['I'] = 0;
	    }
	}
	catch(Exception e){
	    System.out.println(e.getMessage() + oi);
	}
    }
}