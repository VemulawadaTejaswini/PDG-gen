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
  String str[]=r.readLine().trim().split(" ");
  BigInteger a = new BigInteger(str[0]);
  BigInteger b = new BigInteger(str[1]);
  BigInteger c = new BigInteger(str[2]);
  BigInteger d = new BigInteger(str[3]);

  BigInteger amax;
  BigInteger bmax;
  BigInteger result;

  if (a.multiply(c).compareTo(a.multiply(d)) >= 1)
    amax = a.multiply(c);

  else
    amax = a.multiply(d);

  if (b.multiply(c).compareTo(b.multiply(d)) >= 1)
    bmax = b.multiply(c);

  else
    bmax = b.multiply(d);

  if (amax.compareTo(bmax) >= 1) 
    result = amax;
   else
    result = bmax;

  System.out.println(result);
  

  
}
}
  