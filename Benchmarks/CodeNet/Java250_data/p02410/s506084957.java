import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[]      = br.readLine().split(" ");
		int in[]          = parseInts(str);
		int in1[][]       = new int[in[0]][in[1]];
		String str1[]     = new String[in[1]];
		int in2[]         = new int[in[1]];
		int x;
		for(int i=0; i<in[0]; i++){
			str1 = br.readLine().split(" ");
			in1[i] = parseInts(str1);
		}
		for(int i=0; i<in[1]; i++){
			in2[i] = Integer.parseInt(br.readLine());
		}
		for(int n=0; n<in[0]; n++){
			x = 0;
			for(int m=0; m<in[1]; m++){
				x = in1[n][m] * in2[m] + x;
			}
			System.out.println(x);
		}
	}
	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}