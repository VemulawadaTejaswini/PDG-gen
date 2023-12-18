import java.io.*; 
public class Main{
  public static void main(String[] args) throws java.io.IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    String buf =br.readLine();
    String[] res = buf.split(" ",0);
    int[] x = new int[res.length];
    for(int i=0;i<res.length; i++){
      x[i] = Integer.parseInt(res[i]);
    }
    System.out.println(x[0]*x[1]+ " "+ 2*(x[0]+x[1]));
  }
}