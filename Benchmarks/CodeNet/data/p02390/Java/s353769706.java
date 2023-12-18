import java.io.*; 
public class Main{
  public static void main(String[] args) throws java.io.IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    String buf =br.readLine();
    //int[] x = s2i(buf);
    int x=Integer.parseInt(buf);
    int h=x/3600;
    int m = (x-h*3600)/60;
    int s = x%60; 
    System.out.println(h+":"+m+":"+s);
  }

  static int[] s2i(String s){
    String[] res = s. split(" ",0);
    int[] x= new int[res.length];
    for(int i=0;i<res.length;i++){
      x[i]= Integer.parseInt(res[i]);
    }
    return x;
  }
}