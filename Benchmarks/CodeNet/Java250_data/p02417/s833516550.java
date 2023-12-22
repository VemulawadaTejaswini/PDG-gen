import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l,s="";
		while ((l=br.readLine())!=null) s+=l.toLowerCase();
		s=s.replace(" ","");
		char[] a={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int r;
        for(char c:a){
        	r=0;
        	for(int i=0;i<s.length();i++){
            	if(s.charAt(i)==c) r+=1; 
        	}
        	System.out.println(c+" : "+r);
        }
	}
}