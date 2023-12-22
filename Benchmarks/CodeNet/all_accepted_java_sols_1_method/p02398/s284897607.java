import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
      	String strArr[] = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);
      
      	for (int i = a; i <= b; i++) {
        	if (c % i == 0) {
            count ++;
          } 
        }
      	System.out.println(count);
    }
}
