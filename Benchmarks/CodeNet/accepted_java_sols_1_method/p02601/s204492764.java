import java.util.*;
import java.io.*;
import java.lang.*; 
public class Main {
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int k = sc.nextInt();
		if(B <= A){
		    while(k > 0 && B <= A){
		        B=B*2;
		        k--;
		    }
		}
		if(C <= B){
		    while(k >0 && C<=B){
		        C=C*2;
		        k--;
		    }
		}
		if(B>A && C >B){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
    }
}