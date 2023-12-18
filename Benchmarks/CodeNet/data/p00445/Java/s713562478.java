import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	int i=0,j=0;//int[] flag = new int['Z'];
	int oi = 0;
	try{
	    while(null!=(line = br.readLine())){
		line = 'A' + line;
		while((oi = line.indexOf("OI")) != -1){
		    //flag[line.charAt(oi-1)]++;
		    if(line.charAt(oi-1)=='J')j++;
		    if(line.charAt(oi-1)=='I')i++;
		    line = line.substring(oi + 1);
		}
		System.out.println(Integer.toString(j));//flag['J']));
		System.out.println(Integer.toString(i));//flag['I']));
		//flag['J'] = flag['I'] = 0;
		i=j=0;
	    }
	}
	catch(Exception e){
	    System.out.println(e.getMessage() + oi);
	}
    }
}