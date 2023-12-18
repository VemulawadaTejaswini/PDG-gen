import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
   
public class Main {
    boolean[] dictionary = new boolean[268435456];
    public static void main(String[] args) throws IOException {
//    	long l = System.currentTimeMillis();
        new Main().exec();
//    	long l2 = System.currentTimeMillis();
//    	System.out.println(l2 - l);
    }
      
    public void exec() throws IOException {
        InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for(int i=0; i<n; i++) {
        	String cmd = in.br.readLine();
        	if(cmd.charAt(0)=='i'){
        		insert(cmd.substring(7));
        	}else{
        		out.println(find(cmd.substring(5))?"yes":"no");
        	}
        }
        out.flush();
    }
    
    private void insert(String str) {
    	int key = convertKey(str);
		dictionary[key] = true;
    }

    private boolean find(String str) {
    	int key = convertKey(str);
		return dictionary[key];
    }
    
    private int convertKey(String str) {
    	int len = str.length();
    	int key = (len<<2);
    	for(int i=0; i<len; i++) {
    		switch(str.charAt(i)){
    		case 'A':
    			key|=1;
    			break;
    		case 'G':
    			key|=2;
    			break;
    		case 'C':
    			key|=3;
    		}
    		key <<= 2;
    	}
    	return key;
    }
}

class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }

}