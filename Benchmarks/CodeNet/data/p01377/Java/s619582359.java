import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		int count = 0;
		for(int i = 0; i < in.length/2; i++) {
			char a = in[i];
			char b = in[in.length - i - 1];
			if(a == '(' && b == ')') continue;
			if(a == ')' && b == '(') continue;
			if(a == '(' || a == ')' || b == '(' || b == ')') count++;
			else if(a != b) count++;
		}
		char a = in[in.length/2];
		if(in.length % 2 == 1 && a != 'i' && a != 'w') count++; 
		System.out.println(count);
	}
}