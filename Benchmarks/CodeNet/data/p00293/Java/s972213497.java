package com.yucchiy.aoj.p0298;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String... args) {
		new Main().run();
	}
	
	public void run() {
		List<Time> ts = new ArrayList<Time>();
		final int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			ts.add(new Time(sc.nextInt(), sc.nextInt()));
		}
		
		final int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			ts.add(new Time(sc.nextInt(), sc.nextInt()));
		}
		
		// solve
		Collections.sort(ts);
		for (int i = 0; i < ts.size() - 1; i++) {
			System.out.print(ts.get(i) + " ");
		}

		System.out.println(ts.get(ts.size() - 1));
	}
	
	public class Time implements Comparable<Time> {
		int h, m;
		
		Time(int h, int m) {
			this.h = h;
			this.m = m;
		}

		@Override
		public String toString() {
			return String.format("%d:%02d", this.h, this.m);
		}

		@Override
		public int compareTo(Time o) {
			return ((this.h * 60 + this.m) < (o.h * 60 + o.m)) ? -1 : 1;
		}
	}
}