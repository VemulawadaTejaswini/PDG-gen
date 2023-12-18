import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	  public static void main(String[] args) {

		while(true){
		String n;
	    int ans=0;
	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        

	        
		    n = reader.readLine();

		    int leng = n.length();
	        for(int i=0;i<leng;i++){
	        String N = n.substring(i,i+1);
	        int num = new Integer(N).intValue();
	        ans=ans+num;
	        }
		    if(ans==0){
		    	System.exit(0);
		    }
	        System.out.println(ans);
	      }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	    }
	}