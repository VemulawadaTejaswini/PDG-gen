import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String sp = sc.readLine();
	    int[] map = new int[sp.length()];
	    for(int i=0; i<sp.length(); i++)
		map[i] = sp.charAt(i)-')'+1;
	    int count=0;
	    for(int i=0; i<sp.length(); i++){
		for(int j=i+2; j<sp.length(); j+=2){
		    int one = 0, zero = 0;
		    boolean flag = true;
		    for(int k=i; k<j; k++){
			if(map[k] == 1)
			    one++;
			else
			    zero++;
			if(one>(j-i)/2 || zero>(j-i)/2){
			    flag = false;
			    break;
			}
		    }
		    if(flag)
			count++;
		}
	    }
	    System.out.println(count);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}