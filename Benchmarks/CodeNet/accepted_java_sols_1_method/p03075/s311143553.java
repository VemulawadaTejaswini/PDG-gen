import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int[] antena = new int[5];
    int k = 0;

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      antena[0] = Integer.parseInt(br.readLine());
      antena[1] = Integer.parseInt(br.readLine());
      antena[2] = Integer.parseInt(br.readLine());
      antena[3] = Integer.parseInt(br.readLine());
      antena[4] = Integer.parseInt(br.readLine());
      k = Integer.parseInt(br.readLine());
    } catch (IOException e) {
        e.printStackTrace();
        System.exit(1);
    }

    boolean result = true;
    parent:
    for (int i = 0; i < antena.length - 1; i++) {
      for (int j = i + 1; j <= antena.length-1; j++) {
        if (k < antena[j] - antena[i]) {
          result = false;
          break parent;
        }
      }
    }

    if (result) {
      System.out.print("Yay!");
    } else {
      System.out.print(":(");
    }

  }
}
