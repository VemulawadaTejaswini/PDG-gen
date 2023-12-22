import java.io.*;
import java.util.Arrays;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = parseInts(br.readLine().split(" "));
		int in1[][] = new int[in[0]][in[1]];
		int in2[] = new int[in[1]];
		for(int i=0; i<in[0]; i++){
			in1[i] = parseInts(br.readLine().split(" "));
		}
		for(int n=0; n<in[0]; n++){
			for(int m=0; m<in[1]; m++){
				in2[m] += in1[n][m];
				System.out.print(in1[n][m] + " ");
			}
			System.out.println(sum(in1[n]));
		}
		for(int i=0; i<in[1]; i++){
			System.out.print(in2[i] + " ");
		}
		System.out.println(sum(in2));
	}
	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
	static int sum(int[] x){
		int t = 0;
		for(int a : x){
			t += a;
		}
		return t;
	}
}