import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
       
      while(true){
      String[] num=buf.readLine().split(" ");
      int x=Integer.parseInt(num[0]);
      int y=Integer.parseInt(num[2]);
       
          if(num[1].equals("+")){
              System.out.println(x+y);
          }
          else if(num[1].equals("-")){
              System.out.println(x-y);
          }
          else if(num[1].equals("*")){
              System.out.println(x*y);
          }
          else if(num[1].equals("/")){
              System.out.println(x/y);
          }
          else{
                    break;
          }
            }
        }
    }