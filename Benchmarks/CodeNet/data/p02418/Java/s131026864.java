import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s = buf.readLine();
		String p = buf.readLine();
		char[] cs;
		char[] cp;
		String result = "Yes";

		cs = s.toCharArray();
		cp = p.toCharArray();
		if(s.length() == 0)
			result = "No";
		for(int i=0; i<s.length(); i++){
			if(cs[i] == cp[0]){
				for(int k=i, j=0; j<p.length(); k++,j++){
					System.out.println(k);
					if(k==s.length() && j<p.length()){
						k=0;
					}
					if(cs[k] != cp[j]){
						result = "No";
						break;
					}
					
					
				}
			}
		}
		System.out.println(result);

	}
}