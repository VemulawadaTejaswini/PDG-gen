import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input=null;
       String upper=null;
      try{
    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	  input=br.readLine();
    	  upper=input.toUpperCase();
    	  System.out.println(upper);
      }catch(Exception e){
    	  e.printStackTrace();
      }
	}

}