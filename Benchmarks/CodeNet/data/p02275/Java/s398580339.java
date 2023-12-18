import java.io.*;

class Main {
  static int[] C = new int[10001];

  public static void main(String... args) throws IOException {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    int size = Integer.parseInt(br.readLine());
    int current = 0;

    String[] strInputs = br.readLine().split(" ", 0);

    int[] A = new int[size];
    int[] B = new int[size + 1];

    for (int i = 0; i < size; i++) {
      A[i] = Integer.parseInt(strInputs[i]);
      C[A[i]]++;
    }

    for (int i = 1; i < 10001; i++) {
      C[i] += C[i - 1];
    }

    for (int i = size - 1; i > -1; i--) {
      B[C[A[i]]--] = A[i];
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 1; i < size; i++) {
      builder.append(B[i]).append(' ');
    }
    System.out.println(builder.append(B[size]));
  }
}

