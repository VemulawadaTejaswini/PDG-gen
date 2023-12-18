import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
      String str;
      String[] arr;
      int H=0;
      int W=0;
      while((str=mBufferedReader.readLine())!=null){
        arr=str.split(" ");
        H=Integer.parseInt(arr[0]);
        W=Integer.parseInt(arr[1]);
        if((H==0)&&(W==0)){
          break;
        }
        for(int i=0;i<H;i++){
          for(int j=0;j<W;j++){
            System.out.print("#");
          }
          System.out.print("\n");
        }
          System.out.print("\n");
      }
      mBufferedReader.close();
    }
}
        
