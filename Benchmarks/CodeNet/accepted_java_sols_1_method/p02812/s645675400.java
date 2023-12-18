import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    int ans = 0;

    for(int i = 0; i < n - 2; i++){
      if(c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C'){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
