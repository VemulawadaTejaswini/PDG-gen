import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    ArrayList<Integer> set = new ArrayList<>();
    for(int i = 0; i < 2*n; i++) set.add(scan.nextInt());
    Collections.sort(set);

    int result = 0;
    for(int i = 0; i < 2*n; i+=2) {
      result += Math.min(set.get(i),set.get(i+1));
    }
    System.out.println(result);
  }
}
