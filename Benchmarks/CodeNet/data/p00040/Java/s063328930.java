import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static char[] list = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = Integer.parseInt(stdIn.nextLine());
		for(int i = 0; i < n; i++) {
			String tmp = stdIn.nextLine();
			solv(tmp);
		}
	}
	public static void solv(String tmp) {
		for(int a = 0; a < 1000; a++) {
			for(int b = 0; b < 1000; b++) {
				if(a % 2 == 0 || a% 13 == 0 || a % 26 == 0) continue;
				if(check(p(tmp,a,b))) {
					return;
				}
			}
		}
	}
	
	public static String p(String a, int b, int c) {
		String ret = "";
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') { 
				ret += " ";
				continue;
			}
			int y = Arrays.binarySearch(list, a.charAt(i));
			int ans = (b * y + c) % 26;
			ret += String.valueOf(list[ans]);
		}
		return ret;
	}
	
	public static boolean check(String a) {
		for(int i = 0; i < a.length()-4; i++) {
			String tmp = a.substring(i, i+4);
			if(tmp.equals("that") || tmp.equals("this")) {
				System.out.println(a);
				return true;
			}
		}
		return false;
	}
}