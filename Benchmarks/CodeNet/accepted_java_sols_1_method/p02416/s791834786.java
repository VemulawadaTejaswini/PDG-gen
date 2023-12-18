import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        while(true){
			String str = br.readLine();
			if(str.equals("0")) {
            	break;
            }
            int n = 0;
          	for(int i = str.length() - 1; i >= 0; i--) {
            	n += str.charAt(i) - '0';
            }
          	System.out.println(n);
        }
    }
}
