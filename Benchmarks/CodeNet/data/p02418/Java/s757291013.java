import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sln;
		String pln;
		String ans="no";
		int plen,j;
		sln=br.readLine();
		pln=br.readLine();
		plen=pln.length();
		char s[]=(sln+sln.substring(0,plen-1)).toCharArray();
		char p[]=pln.toCharArray();
		
		for(int i=0;i<=s.length-plen;i++){
			if((s[i]==p[0])&&(s[i+plen-1]==p[plen-1])){
					for(j=1;j<plen-1;j++){
						if(s[i+j]==p[j]){
							continue;
						}else break;
				
				}
					if(j==plen-1) ans="yes";
			}
		}
		System.out.println(ans);
	}
}