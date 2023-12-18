import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        while(true){
          	String strArr[] = (br.readLine()).split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(strArr[2]);
			
          	if(a == -1 && b == -1 && c == -1){
            	break;
            }
          	
          	int sum = a + b;
			if(a == -1 || b == -1) {
            	System.out.println("F");
            } else if(sum >= 80 ) {
            	System.out.println("A");
            } else if(sum >= 65 ) {
            	System.out.println("B");
            } else if(sum >= 50 || c >= 50) {
            	System.out.println("C");
            } else if(sum >= 30) {
            	System.out.println("D");
            } else {
           		System.out.println("F"); 
            }
        }
    }
}
