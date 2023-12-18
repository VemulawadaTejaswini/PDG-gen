import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] spade = new int[13];
    int[] heart = new int[13];
    int[] dia = new int[13];
    int[] clover = new int[13];
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      int a = sc.nextInt();
      if(s.equals("S")) {
        spade[a - 1] = 1;
      } else if(s.equals("H")) {
        heart[a - 1] = 1;
      } else if(s.equals("D")) {
        dia[a - 1] = 1;
      } else {
        clover[a - 1] = 1;
      }
    }
    for(int i = 0; i < 13; i++) {
      if(spade[i] == 0) {
        System.out.println("S " + (i + 1));
      }
    }
    for(int i = 0; i < 13; i++) {
      if(heart[i] == 0) {
        System.out.println("H " + (i + 1));
      }
    }
    for(int i = 0; i < 13; i++) {
      if(clover[i] == 0) {
        System.out.println("C " + (i + 1));
      }
    }
    for(int i = 0; i < 13; i++) {
      if(dia[i] == 0) {
        System.out.println("D " + (i + 1));
      }
    }
  }
}

