import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    sc.nextLine();
    String[] s = new String[n];
    for(int i = 0; i <n;i++){
      s[i] = sc.nextLine();
    }
    Arrays.sort(s);
    String strs = String.join("", s);
    System.out.println(strs);
  }
}