import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
public static void main(String[] args) throws IOException{
  BufferedInputStream bis = new BufferedInputStream(System.in);
  BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
  PrintStream ps = new PrintStream(System.out);
  int n=Integer.parseInt(r.readLine());
  if(n==0)
    ps.println(1);
    
  
  if(n==1)
  ps.println(0);
  

  
}
}
  