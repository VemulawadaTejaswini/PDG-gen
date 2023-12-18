import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    long ans = 1;

    for(int i = 0; i < n; i++){
      s[i] = sc.next();
    }

    Arrays.sort(s);

    for(int i = 0; i < n - 1; i++){
      if(s[i].equals(s[i + 1])){
        ans -= 1;
      }
      ans += 1;
    }

    System.out.println(ans);
  }
}
