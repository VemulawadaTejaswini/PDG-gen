import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        for(int i=0;i<s.length();i++){
        	if(Character.isUpperCase(s.charAt(i))){
            	System.out.print(s.substring(i,i+1).toLowerCase());
        	}else{
        		System.out.print(s.substring(i,i+1).toUpperCase());
        	}
        }
        System.out.println("");
	}
}