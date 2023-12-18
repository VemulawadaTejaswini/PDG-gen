import java.io.*;
public class Main{
  public static void main(String[]args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    while(ture){
      int a=Integer.parseInt(br.readLine());

      String c=br.readLine();

      int b=Integer.parseInt(br.readLine());

      if( c.equals("?") ) System.exit(0);

      if( c.equals("+") )  System.out.print(a+b);
      if( c.equals("-") ) System.out.print(a-b);
      if( c.equals("*") ) System.out.print(a*b);
      if( c.equals("/") ) System.out.print((int)a/b);
    }

  }
}

