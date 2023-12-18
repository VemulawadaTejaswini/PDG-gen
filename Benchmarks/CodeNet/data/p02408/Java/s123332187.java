import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
      		String[] strs = new String[52];
	        Boolean[] judes = new Boolean[52];
	        String[] suit = {"S","H","C","D"};
	        for(int i = 0; i < suit.length; i++){
			for(int l = 1; l <= 13; l++){
                		strs[i * 13 + l - 1] = suit[i] + " " + l;
                		judes[i * 13 + l - 1] = false;
           		}
       		}
        	for(int i = 0; i < n; i++){
        		String str = br.readLine();
          		for(int l = 0; l < strs.length; l++){
                		if(str.equals(strs[l])){
                   			judes[l] = true;
          	          		break;
                		}
            		}
        	}
        	for(int i = 0; i < judes.length; i++){
        		if(!judes[i]){
                		System.out.println(strs[i]);
            		}
        	}
    	}
}