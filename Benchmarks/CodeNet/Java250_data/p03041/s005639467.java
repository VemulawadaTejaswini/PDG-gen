import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	String s = sc.next();
	
	for(int i = 0; i < n; i++){
		if(i != k-1){
			System.out.printf(s.substring(i,i+1));
		}else{
			System.out.printf(s.substring(i,i+1).toLowerCase());
		}
	}
}
}
