
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    while ((readStr = reader.readLine()) != null) {
      int n = Integer.parseInt(readStr);
      int c = 0;

      for (int i = 0; i <= 9; i++)
        for (int j = 0; j <= 9; j++)
          for (int k = 0; k <= 9; k++)
            for (int l = 0; l <= 9; l++)
              if (i + j + k + l == n)
                c++;

      System.out.println(c);
    }
  }

}