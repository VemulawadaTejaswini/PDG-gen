import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String in = stdIn.nextLine();
		int ix = stdIn.nextInt();
		String inC = in.substring(0);
		boolean c1 = check1(inC,ix);
		boolean c2 = check2(in,ix);
		
		if(c1 && c2) {
			System.out.println("U");
		}
		else if(c1) {
			System.out.println("M");
		}
		else if(c2) {
			System.out.println("L");
		}
		else {
			System.out.println("I");
		}
	}
	static boolean check1(String a, int b) {
		int id = 0;
		for(int i = 0; i < a.length(); i++) {
			
			
			if(a.charAt(i) == '+') {
				id = i+1;
			}
			if(a.charAt(i) == '*') {
				int o1 = Integer.parseInt(a.substring(id, i));
				int id2 = 0;
				for(int j = i+1; j < a.length(); j++) {
					if(a.charAt(j) == '+' || a.charAt(j) == '*' ) {
						id2 = j;
						break;
					}
					if(j == a.length()-1) {
						id2 = j+1;
						break;
					}
				}
				int o2 = Integer.parseInt(a.substring(i+1,id2));
				String tmp = a.substring(0,id);
				tmp += (o1 * o2);
				tmp += a.substring(id2,a.length());
				a = tmp;
				i = -1;
			}
		}
		for(int i = 0; i < a.length(); i++) {

			if(a.charAt(i) == '+') {
				int o1 = Integer.parseInt(a.substring(0,i));
				for(int j = i+1; j < a.length(); j++) {
					
					if(a.charAt(j) == '+') {
						int o2 = Integer.parseInt(a.substring(i+1,j));
						o1 += o2;
						String tmp = String.valueOf(o1);
						tmp += a.substring(j,a.length());
						a = tmp;
						i = -1;
						break;
					}
					if(j == a.length()-1) {
						int o2 = Integer.parseInt(a.substring(i+1,j+1));
						o1 += o2;
						String tmp = String.valueOf(o1);
						tmp += a.substring(j+1,a.length());
						a = tmp;
						i = -1;
						break;
					}
				}
			}
		}
		
		if(Integer.parseInt(a) == b) return true;
		return false;
		
	}
	static boolean check2(String a, int b) {
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '*' || a.charAt(i) == '+') {
				boolean x = false;
				if(a.charAt(i) == '*') {
					x = true;
				}
				int o1 = Integer.parseInt(a.substring(0, i));
				for(int j = i+1; j < a.length(); j++) {
					if(a.charAt(j) == '*' || a.charAt(j) == '+') {
						int o2 = Integer.parseInt(a.substring(i+1,j));
						if(x) {
							String tmp = String.valueOf((o1 * o2)) + a.substring(j);
							a = tmp;
						}
						else {
							String tmp = String.valueOf((o1 + o2)) + a.substring(j);
							a = tmp;
						}
						i = -1;
						break;
					}
					if(j == a.length()-1) {
						int o2 = Integer.parseInt(a.substring(i+1,j+1));
						if(x) {
							String tmp = String.valueOf((o1 * o2)) + a.substring(j+1);
							a = tmp;
						}
						else {
							String tmp = String.valueOf((o1 + o2)) + a.substring(j+1);
							a = tmp;
						}
						i = -1;
						break;
					}
				}
			}
		}
		if(Integer.parseInt(a) == b) {
			return true;
		}
		return false;
	}
}