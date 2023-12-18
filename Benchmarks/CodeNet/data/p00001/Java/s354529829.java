import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    while (scanner.hasNextInt()) {
       al.add(scanner.nextInt());
    }
    
    Collections.sort(al);
    Collections.reverse(al);
    for (int i = 0; i < 3; i++) {
      System.out.println(al.get(i));
    }
  }
}