import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String p=br.readLine();
    	boolean m=false;
    	for(int i=0;i<s.length();i++){
        	if(s.charAt(i)==p.charAt(0)){
        		if(p.length()>1){
            		int k=i+1;
            		for(int j=1;j<p.length();j++){
        				if(k>=s.length()) k=0;
            			if(s.charAt(k)==p.charAt(j)){
            				m=true;
            				k++;
            			}else{
            				m=false;
            				break;
            			}
            		}
        		}else{
        			m=true;
        		}
        		if(m) break;
        	}
    	}
    	if(m){
    		System.out.println("Yes");
    	}else{
        	System.out.println("No");
    	}        
	}
}