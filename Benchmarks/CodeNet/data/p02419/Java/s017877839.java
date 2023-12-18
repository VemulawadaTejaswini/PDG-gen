import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W=" "+br.readLine().toLowerCase()+" ";
        String T=" ",n;
        while(true){
        	n=br.readLine();
        	if(n.equals("END_OF_TEXT")) break;
        	T+=n+" ";
        }
    	T=T.toLowerCase();
        System.out.println(count(T,W));
	}
	
	private static int count(String str, String reg){
		int c=0,r=0;
		while(true){
		  c=str.indexOf(reg,c);
		  if(c==-1) break;
		  r++;
		  c++;
		}
		return r;
	}
}