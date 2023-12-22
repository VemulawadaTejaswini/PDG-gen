import java.io.*; 
public class Main{
  public static void main(String[] args) throws java.io.IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    String buf =br.readLine();
    int x= Integer.parseInt(buf);
    x=(int)Math.pow(x,3);
    System.out.println(x);
  }
}