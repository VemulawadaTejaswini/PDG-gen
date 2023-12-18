import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int[] a = new int[4];
      int[] b = new int[4];
      for (int i = 0; i < 4; i++) {
        a[i] = sc.nextInt();
      }
      for (int i = 0; i < 4; i++) {
        b[i] = sc.nextInt();
      }
      int hit  = 0;
      int blow = 0;
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
          if (b[j] == a[i]) {
            if (i == j) {
              hit++;
            }
            else {
              blow++;
            }
          }
        }
      }
      System.out.println(hit + " " + blow);
    }
  }
}