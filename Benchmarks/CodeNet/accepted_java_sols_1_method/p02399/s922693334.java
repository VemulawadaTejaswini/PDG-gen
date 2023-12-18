import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    try{
      int a,b,d,r;
      double f;
      String str=mBufferedReader.readLine();
      String[] arr=str.split(" ");
      a=Integer.parseInt(arr[0]);
      b=Integer.parseInt(arr[1]);
      d=a/b;
      r=a%b;
      f=(double)a/b;
      System.out.printf("%d %d %f\n",d, r, f);
    }catch(IOException e){
      System.out.println("Error");
    }
  }
}
