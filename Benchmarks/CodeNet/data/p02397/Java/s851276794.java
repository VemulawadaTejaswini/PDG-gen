import java.io.*;
public class Main{
  public static void main(String[] args){
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    try{
      int x,y;
      String str;
      String[] arr;

      while((str=mBufferedReader.readLine())!=null){
        arr=str.split(" ");
        x=Integer.parseInt(arr[0]);
        y=Integer.parseInt(arr[1]);
    
        if(x==0&&y==0){
          break;
        }
          if(x<=y){
            System.out.println(str);
          }else{
            System.out.println(arr[1]+" "+arr[0]);
          }
        }
        mBufferedReader.close();
      }catch(IOException e){
        System.out.println("Error");
      }
   }
}
