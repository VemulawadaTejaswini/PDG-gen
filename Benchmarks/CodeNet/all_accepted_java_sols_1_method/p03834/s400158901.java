import java.io.*;

public class Main {
 public static void main (String[ ] args) {
  String buf;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  try {
   buf = br.readLine();
  } catch(Exception e) {
   buf = null;
  }

  buf = buf.replace(',', ' ');
  System.out.println(buf);
 }
}