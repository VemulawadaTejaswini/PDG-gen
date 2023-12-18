import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				/* input */
				String[] s = new String[4];
				s[0] = br.readLine();
				if(s[0].charAt(0)=='-'){
					break;
				}
				s[1] = br.readLine();
				s[2] = br.readLine();
				s[3] = "";
				
				int[] c = {0,0,0,1};
				for(int i=0;i<s[0].length()+s[1].length();i++){
					if(s[2].charAt(c[2])==(s[c[3]].charAt(c[c[3]]))){
						//System.out.println("HIT:" + s[c[3]].charAt(c[c[3]]));
						c[c[3]]++;
						c[3] = 0;
						c[2]++;
					} else {
						//System.out.println("ADD:" + s[c[3]].charAt(c[c[3]]));
						s[3] = s[3] + s[c[3]].charAt(c[c[3]]);
						c[c[3]]++;
						c[3] = 1;
					}
					if(c[2]>=s[2].length()){
						s[3] = s[3] + s[c[3]].charAt(c[c[3]]) + s[1].substring(c[1]);
						break;
					}
				}
				System.out.println(s[3]);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}