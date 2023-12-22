import java.util.Scanner;

class Main {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        //System.out.println("数値を入力してください。");
        //Scanner scanner2 = new Scanner(System.in);
        //System.out.println("数値を入力してください。");
        double n = scanner1.nextInt();
        double m = scanner1.nextInt();
        double l;
        l = n/m;
        System.out.println(l);
  }
}