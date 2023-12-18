import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    while (true) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      if (n == 0 && x == 0) {
        break;
      }
      for (int k = 1; k < n-2; k++) {
        for (int j = k+1; j < n-1; j++) {
          for (int i = j+1; i < n; i++) {
            if (i+j+k == x) {
              counter++;
            }
          }
        }
      }
      System.out.println(counter);
    }
  }
}