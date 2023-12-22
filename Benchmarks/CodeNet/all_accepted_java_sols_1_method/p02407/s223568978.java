import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	
      	int n = Integer.parseInt(br.readLine());
      	String a[] = br.readLine().split(" ");
      	StringBuilder sb = new StringBuilder();
       	for(int i = n - 1; i >= 0; i--) {
        	sb.append(a[i] + " ");
        }
      
      	String result = sb.toString().trim();
      	System.out.println(result);

    }
}
