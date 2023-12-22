import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	String st;
	try{
	    while((st=sc.readLine())!=null){
		int[] t = new int[10];
		for(int i=0; i<10; i++)
		    t[i] = st.charAt(i)-'0';
		for(int i=9; i>0; i--){
		    int j;
		    for(j=0; j<i; j++)
			t[j] = (t[j]+t[j+1])%10;
		}
		System.out.println(t[0]);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}