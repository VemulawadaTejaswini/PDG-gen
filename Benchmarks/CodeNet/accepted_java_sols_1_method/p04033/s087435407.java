import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		long l = 1l*a*b;
		if(l<=0){
			System.out.println("Zero");
			return;
		}
		if(a>0 && b>0){
			System.out.println("Positive");
			return;
		}
		if((a+b)%2==0){
			System.out.println("Negative");
		}else{
			System.out.println("Positive");
		}
	}
}