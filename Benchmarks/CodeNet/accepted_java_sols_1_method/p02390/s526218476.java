import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
  
    String[] strAry = str.split(" ");
    int x = Integer.parseInt(strAry[0]);
  	
  
    System.out.println((x/3600 )+ ":"+((x%3600)/60)+":"+ ((x%3600)%60) );
  } 
}