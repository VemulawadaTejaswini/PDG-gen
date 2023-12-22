import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		long[] in = new long[Integer.parseInt(s.next())];
		for (int i = 0; i < in.length; i++) {
			in[i]=Long.parseLong(s.next());
		}
		reverse(in);
		boolean b = false;
		for(long l:in) {
			if(b)
				System.out.print(" ");
			b=true;
				System.out.print(l);
		}
		System.out.println();
	}
	static void swap(long[] l, int a, int b) {
		l[a] += l[b];
		l[b]  = l[a] - l[b];
		l[a] -= l[b];
	}
	static void reverse(long[] b) {
		for (int c = 0; c < b.length / 2; c++) {
			swap(b, c, b.length - 1 - c);
		}
	}

}