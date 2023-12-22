import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String str;
      int a, b, i, count = 0;

      str = reader.readLine();
      a = Integer.parseInt(str.substring(0, 5));
      b = Integer.parseInt(str.substring(6));

      for (i = a; i <=b ; i++ ) {
        if(i/10000 == i%10){
          if(((i - i/10000*10000) - i%1000) /1000 == (i%100 - i%10) /10 ){
            count = ++count;
          }
        }
      }

      System.out.println(count);
    }
    catch (Exception e) {
      System.out.println("error");
    }
  }
}
