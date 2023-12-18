import java.util.Scanner;
 
 static int calc(int num) {
  if (400 =< num =< 599) {
    System.out.println(8);
  } else if (600 =< num =< 799) {
    System.out.println(7);
  } else if (800 =< num =< 999) {
    System.out.println(6);
  } else if (1000 =< num =< 1199) {
    System.out.println(5);
  } else if (1200 =< num =< 1399) {
    System.out.println(4);
  } else if (1400 =< num =< 1599) {
    System.out.println(3);
  } else if (1600 =< num =< 1799) {
    System.out.println(2);
  } else if (1800 =< num =< 1999) {
    System.out.println(1);
  }
  public static void main (String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int num stdIn.nextInt();
    
    calc(num);
  }
}