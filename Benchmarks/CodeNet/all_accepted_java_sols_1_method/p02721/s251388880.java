import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int c = sc.nextInt();
    String s = sc.next();
    int front[] = new int[k]; // 前から貪欲
    int back[] = new int[k]; // 後ろから貪欲
    ArrayList<Integer> res = new ArrayList<>();
    int num = 0;
    int i = 0;
    while (num < k) {
      if (s.charAt(i) == 'o') {
        front[num] = i;
        i += c;
        num++;
      }
      i++;
    }
    num = k-1;
    i = n-1;
    while (num >= 0) {
      if (s.charAt(i) == 'o') {
        back[num] = i;
        i -= c;
        num--;
      }
      i--;
    }
    for (int j = 0; j < k; j++) {
      if (front[j] == back[j]) res.add(front[j]+1); // インデックスから日に直すことに注意
    }
    if (!(res.isEmpty())) {
      for (int e: res) {
        System.out.println(e);
      }
    }
    sc.close();
  }
}