import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public static void main (String[] args) throws Exception {
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			StringTokenizer st = new StringTokenizer(str, ",");
			while(st.hasMoreTokens()) {
				int[] list = new int[11];
				list[0] = 0;
				for(int i=0; i<10; i++) {
					list[i+1] = list[i] + Integer.parseInt(st.nextToken());
				}
				int va = Integer.parseInt(st.nextToken());
				int vb = Integer.parseInt(st.nextToken());
				solve(list,va,vb);
			}
		}
	}
	
	public static void solve(int[] list, int va, int vb) {
		float d = (float)list[10];
		float a = (float)va;
		float b = (float)vb;
		float dest = d * a / (a+b);
		for(int i=0; i<10; i++) {
			if(dest<=list[i+1]) {
				System.out.println(i+1);
				return;
			}
		}
	}
}