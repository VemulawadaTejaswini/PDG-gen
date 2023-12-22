import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = 0;
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();

    for(int i = l; i <= r; i++) {
      if(i%d == 0) count++;
    }
    System.out.println(count);
  }
}
