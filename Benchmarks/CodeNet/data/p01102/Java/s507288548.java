import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String s1="",s2="";
		while(true) {
			s1=bfr.readLine()+"END";
			s2=bfr.readLine()+"END";
			if(s1.equals(".END")) {
				break;
			}
			String[] s1m=s1.split("\"");
			String[] s2m=s2.split("\"");
			int cnt=0;
			if(s1m.length!=s2m.length) {
				System.out.println("DIFFERENT");
			}else {
				boolean isnea=false;

				for(int i=1; i<s2m.length; i+=2) {
					if(!s1m[i].equals(s2m[i])) {
						isnea=true;
						cnt++;
					}
				}
				if(cnt>1) {
					System.out.println("DIFFERENT");
				}
				else if(cnt==1) {
					System.out.println("CLOSE");
				}
				else if(cnt==0) {
					System.out.println("IDENTICAL");
				}
			}
		}
	}
}
