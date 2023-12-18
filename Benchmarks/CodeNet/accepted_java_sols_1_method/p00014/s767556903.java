import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int d = sc.nextInt();
      int sum = 0;
      for(int i = 1; i < 600/d; i++) {
        sum += i*i*d*d*d;
      }
      System.out.println(sum);
    }
  }
}