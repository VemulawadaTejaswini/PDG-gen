import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) throws java.io.IOException{
//    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;
		
		ia = in.readLine().split(" ");
		int a = Integer.parseInt(ia[0]);
		int b = Integer.parseInt(ia[1]);
		
		if(a<b){
			System.out.println("a < b");
		}else if(a==b){
			System.out.println("a == b");
		}else if(a>b){
			System.out.println("a > b");
		}

	}
}