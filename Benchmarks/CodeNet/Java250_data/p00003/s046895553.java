import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    try {
      input.readLine();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    try {
      while (input.ready()) {
        String[] dataset = input.readLine().split(" ");

        System.out.println(
            isRightTriangle(Integer.valueOf(dataset[0]), Integer.valueOf(dataset[1]), Integer.valueOf(dataset[2])));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String isRightTriangle(int a, int b, int c) {

    ArrayList<Integer> sideArray = new ArrayList<>();
    sideArray.add(a);
    sideArray.add(b);
    sideArray.add(c);

    Collections.sort(sideArray);

    if (sideArray.get(0) * sideArray.get(0) + sideArray.get(1) * sideArray.get(1) == sideArray.get(2)
        * sideArray.get(2))
      return "YES";
    else
      return "NO";
  }
}