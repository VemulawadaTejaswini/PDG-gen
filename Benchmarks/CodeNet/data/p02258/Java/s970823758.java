public class Main {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int n = sc.nextInt();
    int r0 = sc.nextInt();
    int r = sc.nextInt();
    int max = r - r0;
    int min = Math.min(r, r0);
    for(int i = 2; i < n; i++) {
      r = sc.nextInt();
      max = Math.max(max, r - min);
      min = Math.min(min, r);
    }
    System.out.println(max);
  }
}

