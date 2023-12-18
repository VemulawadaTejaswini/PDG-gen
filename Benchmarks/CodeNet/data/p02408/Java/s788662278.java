import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> spade = new ArrayList<>();
    List<Integer> heart = new ArrayList<>();
    List<Integer> dia = new ArrayList<>();
    List<Integer> clover = new ArrayList<>();
    for(int i = 0; i < 13; i++) {
      spade.add(i);
      heart.add(i);
      dia.add(i);
      clover.add(i);
    }
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      int a = sc.nextInt();
      if(s.equals("S")) {
        spade.remove(a - 1);
      } else if(s.equals("H")) {
        heart.remove(a - 1);
      } else if(s.equals("D")) {
        dia.remove(a - 1);
      } else {
        clover.remove(a - 1);
      }
    }
    for(int i = 0; i < spade.size(); i++) {
      System.out.println("S " + (spade.get(i) + 1));
    }
    for(int i = 0; i < heart.size(); i++) {
      System.out.println("H " + (heart.get(i) + 1));
    }
    for(int i = 0; i < dia.size(); i++) {
      System.out.println("D " + (dia.get(i) + 1));
    }
    for(int i = 0; i < clover.size(); i++) {
      System.out.println("C " + (clover.get(i) + 1));
    }
  }
}

