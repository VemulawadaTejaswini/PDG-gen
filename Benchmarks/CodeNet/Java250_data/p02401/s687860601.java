import java.io.*;

class Main {
  public static void main(String[] args){
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    try{
      while(true){
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        String op = str[1];
        int b = Integer.parseInt(str[2]);

        switch(op){
          case "+" :  System.out.println(a+b); break;
          case "-" :  System.out.println(a-b); break;
          case "*" :  System.out.println(a*b); break;
          case "/" :  System.out.println(a/b); break;
          case "?" :  break;
        }
        if(op.equals("?")){
          break;
        }
      }
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}