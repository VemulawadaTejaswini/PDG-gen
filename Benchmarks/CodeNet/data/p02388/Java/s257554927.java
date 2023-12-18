public class Main {

  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final int num = Integer.parseInt(reader.readLine());
      System.out.println(num * num * num);
    }
  }
}