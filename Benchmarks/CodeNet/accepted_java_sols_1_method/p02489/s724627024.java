import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		String s2[];
		s="";
		String t;
		t="";
		while(!t.equals("0")){
			t = br.readLine();
			if (!t.equals("0")){
				s += (" " + t);
			}
		}
		s2 = s.split(" ");
		for(int j=1; j<s2.length; j++){
			System.out.println("Case " + j + ": " + s2[j]);
		}
	}
}