import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static char[][] map = new char[8][8];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			String[] list = new String[n];
			for(int i = 0; i < n; i++) {
				list[i] = stdIn.next();
			}
			for(int i = 0; i < n; i++) {
				for(int j = 1; j < list[i].length(); j++) {
					if(list[i].charAt(j) != '.' && list[i].charAt(j-1) == '.') {
						list[i] = retS(' ',j-1) + "+" + list[i].substring(j);
						for(int k = i-1; k >= 0; k--) {
							if(j-1 < list[k].length() && list[k].charAt(j-1) == ' ') {
								list[k] = list[k].substring(0, j-1) + "|" + list[k].substring(j);
								continue;
							}
							else {
								break;
							}
						}
						break;
					}
				}
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(list[i]);
			}

		}
	}
	static String retS(char a, int b) {
		String tmp = "";
		for(int i = 0; i < b; i++) {
			tmp += a;
		}
		return tmp;
	}
}