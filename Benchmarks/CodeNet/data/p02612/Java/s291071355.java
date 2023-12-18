public class Main {
  public static void main(String[] args) {
    int N = new java.util.Scanner(System.in).nextInt();
    if (N == 1000 || 2000 || 3000 || 4000 || 5000 || 6000 || 7000 || 8000 || 9000 || 10000) {
      int A = 0; 
    } else {
    int A = 1000 - (N % 1000);
    }
    System.out.println(A);
  }
}
