import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			String in = sc.next();
			int count = sc.nextInt();
			for(int j = 0; j < count; j++) {
				sb.append(in);
			}
		}
		char[] str = sb.toString().toCharArray();
		int l = 0;
		
		for(int i = 0; i < str.length; i++) {
			if(str[i] == '(') l++;
			else l--;
			
			if(l < 0) break;
		}
		System.out.println((l == 0)?"YES":"NO");
		
		
		
		
		
		
		
		
	}
}