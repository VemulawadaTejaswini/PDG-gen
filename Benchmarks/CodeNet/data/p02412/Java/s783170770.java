import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[2];
		int in[] = new int[2];
		int cnt;
		while(true){
			str = br.readLine().split(" ");
			in = parseInts(str);
			if(in[0]==0 && in[1]==0) break;
			cnt = 0;
			for(int n=1; n<in[0]-1; n++){
				for(int m=n+1; m<in[0]; m++){
					for(int l=m+1; l<=in[0]; l++){
						if(n+m+l==in[1]){
							cnt = cnt + 1;
						}
					}
				}
			}
			System.out.println(cnt);
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