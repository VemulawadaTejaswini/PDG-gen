import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(Integer.parseInt(scanner.nextLine()));
    }
    int a = list.get(0);
    int e = list.get(4);
    int k = Integer.parseInt(scanner.nextLine());
    if (e -a > k) {
      System.out.println(":(");
    }
    else {
      System.out.println("Yay!");
    }
  }
}