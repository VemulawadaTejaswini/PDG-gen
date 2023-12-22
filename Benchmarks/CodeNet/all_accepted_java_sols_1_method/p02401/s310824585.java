import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	while(true){
	String input = buf.readLine();	
	String[] strAry = input.split(" ");
    int a = Integer.parseInt(strAry[0]);
    String b = strAry[1];
    int c = Integer.parseInt(strAry[2]);
	
    int opt =0;
    
    if(b.equals("?")){
    	break;
    }else if(b.equals("+")){
    	opt =a + c;
    }else if(b.equals("-")){
    	opt = a - c;
    }else if(b.equals("*")){
    	opt = a * c;
    }else if(b.equals("/")){
    	opt = a / c;
    }
    	
	System.out.println(opt);
    
	}
} catch (Exception e) {

	System.out.println("????????????");
	
}
		 }
    }