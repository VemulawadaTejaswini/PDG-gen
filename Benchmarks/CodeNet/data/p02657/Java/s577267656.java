import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    try{
      System.out.println("Aの値を入力してください(1~100)");
      String a = new Scanner(System.in).nextLine();
      int A = Integer.parseInt(a);
      System.out.println("Bの値を入力してください(1~100)");
      String b = new Scanner(System.in).nextLine();
      int B = Integer.parseInt(b);

      if (A>=1 && A<=100 && B>=1 && B<=100){
        int answer = A * B;
        System.out.println("A×Bは");
        System.out.println(answer);

      } else {
        System.out.println("1~100で入力してください。");
      }
     } catch (Exception e){
      System.out.println("整数で入力してください。");
    }
  }
}