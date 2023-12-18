public class Main {
  public static void main(String[] args) {
    int k = 0;
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        k = i * j;
        System.out.println(i + "x" + j + "=" + k);
      }
    }
  }
}