import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    String str=mBufferedReader.readLine();
    String[] arr=str.split(" ");
    int a=Integer.parseInt(arr[0]);
    int b=Integer.parseInt(arr[1]);
    int c=Integer.parseInt(arr[2]);
    if(a<b && b<c){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
