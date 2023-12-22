import java.util.*;
import java.text.*;
import java.io.*;
 
public class Main{
  public static void main(String[] args) throws ParseException,IOException {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    Date heisei = f.parse("2019/04/30");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Date d = f.parse(in.readLine());
    if(d.after(heisei)) {
      System.out.println("TBD");
    }
    else {
      System.out.println("Heisei");
    }
  }
}