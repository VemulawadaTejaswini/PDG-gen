import java.io.*;

class Main{
    public static void main(String args[]){
          int x;
          String buf;

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
          try{
          buf=br.readLine();
          x=Integer.parseInt(buf);
          System.out.println(x*x*x);

          }catch(IOException e){
                System.out.println("入出力エラーです");
          }
    }
}


