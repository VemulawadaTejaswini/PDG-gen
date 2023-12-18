import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];

    for(int i = 0; i < n; i++){
      String city = sc.next();
      double point = 1 / sc.nextDouble();
      int num = i + 1;
      s[i] = city + " " + point + " " + num;
    }

    Arrays.sort(s);

    for(int i = 0; i < n; i++){
      String ans = s[i].split(" ")[2];
      System.out.println(ans);
    }
  }
}
