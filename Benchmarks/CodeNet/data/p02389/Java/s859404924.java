inport java.io.*;
public class Main{
  public static void main (String[]args)throws IOException{
    BufferedReadder br = new BufferedReader (new InputStreamReader(System));
    int a = Integer.parseInt( br.readLine() );
    int b = Integer.parseInt( br.readLine() );
    System.out.println( "a*b");
     System.out.println( "2*a+2*b" ); 
}

 