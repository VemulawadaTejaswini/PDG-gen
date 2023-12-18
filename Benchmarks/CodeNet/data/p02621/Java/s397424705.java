import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String str;
    int i=0;
        try {
            str = br.readLine();
            br.close();
		    i=Integer.parseInt(str);
        } catch (IOException e) {
            e.printStackTrace();
        }    
    System.out.println(i+i*i+i*i*i);
  }
}