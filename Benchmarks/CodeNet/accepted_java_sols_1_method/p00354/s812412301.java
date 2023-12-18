import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main{
	public static void main(String[] args) {
		List<String> youbi =
				new ArrayList<String>(Arrays.asList("mon","tue","wed","thu","fri","sat","sun"));
		int[] hi=new int[30];
		for(int i=0; i<30; i++) {
			hi[i]=(4+i)%7;
		}
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int aa=0;
		while(true) {
			try {
				str=bfr.readLine();
				if(str==null) {
					System.exit(0);
				}
				aa=Integer.parseInt(str);
				
				if(aa>=31) {
					System.exit(0);
				}
				System.out.println(youbi.get((hi[aa-1])));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
