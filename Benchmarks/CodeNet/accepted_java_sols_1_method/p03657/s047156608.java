import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s[]=br.readLine().split(" ");

	int a=Integer.parseInt(s[0]);
	int b=Integer.parseInt(s[1]);

	int c=a+b;

	if(a%3==0||b%3==0||c%3==0){
	    System.out.println("Possible");
	}else{
	    System.out.println("Impossible");
	}
    }
}
