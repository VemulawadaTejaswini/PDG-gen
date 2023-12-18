import java.util.*;
import java.io.*;

public class Main {
	static class PriorityQueue {
		long[] heap = new long[2000000];
		int size = 0;
	}
	public static void main(String[]  args) {
		PriorityQueue s = new PriorityQueue();
		
		out:while (true) {
			next();
			switch (nextbuf[0]) {
				case 'i':
					insert(s, nextLong());
					break;
				case 'e':
					switch (nextbuf[1]) {
						case 'x':
							System.out.println(extractMax(s));
							break;
						case 'n':
							break out;
					}
					break;
			}
		}
	}

	static int parent(int i) {
		return (i  - 1) / 2;
	}

	static int left(int i) {
		return i * 2 + 1;
	}

	static int right(int i) {
		return left(i) + 1;
	}
	
	static void maxheapify(PriorityQueue s, int i) {
		int l = left(i);
		int r = right(i);
		int max = i;
		
		if (l < s.size && s.heap[l] > s.heap[max]) {
			max = l;
		}
		if (r < s.size && s.heap[r] > s.heap[max]) {
			max = r;
		}
		
		if (max != i) {
			long temp = s.heap[i];
			s.heap[i] = s.heap[max];
			s.heap[max] = temp;
			
			maxheapify(s, max);
		}
	}
	
	static void insert(PriorityQueue s, long k) {
		s.heap[s.size] = k;
		int i = s.size ++;
		
		while(i > 0 && s.heap[parent(i)] < s.heap[i]) {
			long tmp = s.heap[parent(i)];
			s.heap[parent(i)] = s.heap[i];
			s.heap[i] = tmp;
			
			i = parent(i);
		}
	}
	
	static long extractMax(PriorityQueue s) {
		long max = s.heap[0];
		
		s.heap[0] = s.heap[-- s.size];
		maxheapify(s, 0);
		
		return max;
	}
	
	private static byte[] buf = new byte[1 << 20];
	private static int len = 0;
	private static int ptr = 0;

	private static byte read() {
		if (ptr >= len) {
			try {
				len = System.in.read(buf);
			} catch (Exception e) {
			}
			ptr = 0;
		}

		return buf[ptr++];
	}

	private static long nextLong() {
		long num = 0;

		byte b = read();
		while(!Character.isDigit(b) && b != '-') b = read();
		int sign;
		if (b == '-') {
			sign = -1;
			b = read();
			if (!Character.isDigit(b)) return 0;
		} else {
			sign = 1;
		}

		while(Character.isDigit(b)) {
			num *= 10;
			num += sign * (b - '0');
			b = read();
		}

		return num;
	}

	private static byte[] nextbuf = new byte[11];
	private static int nextlen;

	private static void next() {
		nextlen = 0;

		byte b = read();
		while(!Character.isAlphabetic(b) && !Character.isDigit(b)) b = read();
		while(Character.isAlphabetic(b) || Character.isDigit(b)) {
			nextbuf[nextlen++] = b;
			b = read();
		}
	}
} 

