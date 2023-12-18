import java.io.*;
  public class Main{
    public static void main(String[] args)throws IOException{
      BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=mBufferedReader.readLine())!=null){
        String[] arr=str.split(" ");
        int a=Integer.parseInt(arr[0]);
        String op=arr[1];
        int b=Integer.parseInt(arr[2]);
        if(op.equals("+")){
          System.out.println(a+b);
        }else if(op.equals("-")){
          System.out.println(a-b);
        }else if(op.equals("*")){
          System.out.println(a*b);
        }else if(op.equals("/")){
          System.out.println(a/b);
        }else{
          break;
        }
      }
      mBufferedReader.close();
  }
}
