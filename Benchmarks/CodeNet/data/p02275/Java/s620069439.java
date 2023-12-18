import java.io.*;

class Main {
  static int[] tmp = new int[10001];

  public static void main(String... args) throws IOException {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    int size = Integer.parseInt(br.readLine());

    String[] strInputs = br.readLine().split(" ", 0);
    int current = 0;
    int last = 0;

    for (int i = 0; i < size; i++) {
      current = Integer.parseInt(strInputs[i]);
      tmp[current]++;
      if (current > last) {
        last = current;
      }
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < last; i++) {
      for (int j = 0; j < tmp[i]; j++) {
        builder.append(i).append(' ');
      }
    }
    for (int i = 0; i < tmp[last] - 1; i++) {
      builder.append(last).append(' ');
    }
    System.out.println(builder.append(last));
  }
}

