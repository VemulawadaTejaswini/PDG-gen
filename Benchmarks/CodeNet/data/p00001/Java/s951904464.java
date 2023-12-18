// Created by bisuk on 2014/09/18.
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//int[] ls = new int[10];
		Integer[] ls = new Integer[10];

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			String s = in.readLine();
			ls[i] = Integer.valueOf(s);
		}

		//System.out.println("ls: " + Arrays.toString(ls));
		//Arrays.sort(ls);
		Arrays.sort(ls, Collections.reverseOrder());

		//System.out.println("ls: " + Arrays.toString(ls));

		//for(int h : ls){
		for (int i = 0; i < 3; i++) {
			System.out.println(ls[i]);
		}
	}
}

/*
	> javac xxx.java
	> java xxx
*/