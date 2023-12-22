import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = 0;
    for(int i = 0; i < 5; i++) {
      int v = sc.nextInt();
      if(v == 0) p = i+1;
    }
    sc.close();
    System.out.println(p);
  }
}