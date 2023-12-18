import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String name = "";
    while(n > 0){
      n--;
      long remain = n % 26l;
      name = alphabet.charAt((int)remain) + name;
      n = n / 26l;
    }
    System.out.println(name);
  }
}