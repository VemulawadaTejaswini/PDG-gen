import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    int k = sc.nextInt();
    int c = sc.nextInt();
    String s = sc.next();
    int[] front = new int[k];
    int[] back = new int[k];
    int step = 0;
    for(int i = -1 - c, j = 0; i < n; ++j) {
        while(j < n && (s.charAt(j) == 'x' || j - i - 1 < c)) ++j;
        i = j;
        step++;
        front[step - 1] = i;
        if(step == k) break;
    }
    step = k;
    for(int i = n + c, j = n - 1; i > -1; --j) {
        while(j > -1 && (s.charAt(j) == 'x' || i - j - 1 < c)) --j;
        i = j;
        step--;
        back[step] = i;
        if(step == 0) break;
    }
    for(int i = 0; i < k; ++i) {
        if(front[i] == back[i]) System.out.println(front[i] + 1);
    }
  }
}