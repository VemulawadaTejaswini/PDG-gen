import java.io.*;
public class Main{
		  public static void main(String[]args){
		    BufferedReader reader = new BufferedReader(newInputStreamReader(System.in));
		    try{
		    	int i = 1;
		    	while(true) {
		          String line = reader.readLine();
		          int x = Integer.parseInt(line);
		          if(x == 0) break;
		          System.out.println("Case" +i+":" +x);
		          ++i;
		          }
		    	reader.close();
		    }catch(IOException e) {
		    }
		  }
		}
