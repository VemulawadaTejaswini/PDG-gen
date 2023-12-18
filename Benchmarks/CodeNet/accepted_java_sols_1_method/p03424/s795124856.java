import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n, i = 0;
      String result = "Three", in;
      n = Integer.parseInt(reader.readLine());

      char a[] = new char[n];

      in = reader.readLine();

      while(i < n){
        a[i] = in.charAt(i);
        i = ++i;
      }

      for (i = 0; i < n ; i++ ) {
        if (a[i] == 'Y'){
          result = "Four";
        }
      }
      System.out.println(result);
    }
    catch (Exception e) {
      
    }
  }
}