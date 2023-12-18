import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean[] cups = new boolean[3];
    cups[0] = true;
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] a  = line.split(",");
      boolean tmp = cups[(a[0].charAt(0)-'A')];
      cups[(a[0].charAt(0)-'A')] = cups[(a[1].charAt(0)-'A')];
      cups[(a[1].charAt(0)-'A')] = tmp;
    }
    if(cups[0]) {
      System.out.println("A");
    }
    if(cups[1]) {
      System.out.println("B");
    }
    if(cups[2]) {
      System.out.println("C");
    }
  }
}