public class Main {
  public static void main(String[] args) {
    int N = new java.util.Scanner(System.in).nextInt();
    if (N == 1000 || N == 2000 || N == 3000 || N == 4000 || N == 5000 || N == 6000 || N == 7000 || N == 8000 || N == 9000 || N == 10000) {
      int A = 0; 
      System.out.println(A);
    } else {
      int A = 1000 - (N % 1000);
      System.out.println(A);
    }
  }
}
