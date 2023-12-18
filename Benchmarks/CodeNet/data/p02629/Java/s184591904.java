import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String alphabet = "zabcdefghijklmnopqrstuvwxy";
    String name = "";
    while(n > 0){
      long remain = n % 26;
      name = alphabet.charAt((int)remain) + name;
      n = n / 26;
    }
    System.out.println(name);
  }
}