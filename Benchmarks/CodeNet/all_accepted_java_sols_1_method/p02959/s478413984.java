import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] monster = new long[n+1];
    long[] hero = new long[n];
    long sum = 0;
    for(int i = 0; i <= n; i++) {
      monster[i] = Long.parseLong(sc.next());
    }
    for(int i = 0; i < n; i++) {
      hero[i] = Long.parseLong(sc.next());
    }
    if(monster[0] >= hero[0]) {
      sum += hero[0];
      hero[0] = 0;
    } else {
      sum += monster[0];
      hero[0] -= monster[0];
    }
    for(int i = 1; i < n; i++) {
      if(monster[i] > hero[i-1] + hero[i]) {
        sum += hero[i-1] + hero[i];
        hero[i] = 0;
      } else if(monster[i] <= hero[i-1]) {
        sum += monster[i];
      } else {
        sum += monster[i];
        hero[i] -= monster[i] - hero[i-1];
      }
    }
    if(monster[n] > hero[n-1]) sum += hero[n-1];
    else sum += monster[n];
    System.out.println(sum);
  }
}
