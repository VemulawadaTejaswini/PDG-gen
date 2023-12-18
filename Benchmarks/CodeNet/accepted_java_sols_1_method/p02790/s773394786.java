import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		
		String s = String.valueOf(min);
		String ans = s;
		
		for(int i =1; i<=max-1; i++){
		
		s += ans;
		}
		
		
		System.out.println(s);

	}
}