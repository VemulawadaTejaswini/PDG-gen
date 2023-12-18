import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	int i, j;
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    i = Integer.parseInt(br.readLine());
	    String[] str = br.readLine().split(" ");
	    for(j=i-1; j>0; j--)
		System.out.print(str[j]+" ");
	    System.out.println(str[0]);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}