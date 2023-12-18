
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    LinkedList<Integer> queue = new LinkedList<Integer>();
    while ((readStr = reader.readLine()) != null) {
      int readInt = Integer.parseInt(readStr);
      if (readInt == 0)
        System.out.println(queue.removeLast());
      else
        queue.add(readInt);
    }
  }

}