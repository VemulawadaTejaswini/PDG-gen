import java.io.*;
public class Main{
  public static void main(String[] args){
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    try{
      int a,b,c;
      int n=0;
      String str;
      String[] arr;
      str=mBufferedReader.readLine();
        arr=str.split(" ");
        a=Integer.parseInt(arr[0]);
        b=Integer.parseInt(arr[1]);
        c=Integer.parseInt(arr[2]);  
        for(int i=a;i<=b;i++){
          if(c%i==0){
          n++;
          }
        }
        System.out.println(n);
        
      
      
      
    }catch(IOException e){
      System.out.println("Error");
    }
  }
}
