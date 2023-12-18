import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		 try {
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		 String ln;
		ln = buf.readLine();
		
       String[] strAry = ln.split(" ");
       int x = Integer.parseInt(strAry[0]);
       int y = Integer.parseInt(strAry[1]);
       
       if (x < y){
       System.out.println("a < b");
       }else if(x == y){
    	   System.out.println("a == b");
       }else if(x > y){
    	   System.out.println("a > b");
       }
      
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
    }
}