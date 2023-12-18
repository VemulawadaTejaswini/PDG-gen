import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	String[] array = str.split(" ");
    	
    	int a = Integer.parseInt(array[0]);
    	int b = Integer.parseInt(array[1]);
    	int c = Integer.parseInt(array[2]);
    	
    	int i,d = 0;
    	
    	for(i=a;i<=b;i++){
    		if(c%i==0){
    			d++;
    		}
    	}
    	System.out.println(d);
    	
    }
}