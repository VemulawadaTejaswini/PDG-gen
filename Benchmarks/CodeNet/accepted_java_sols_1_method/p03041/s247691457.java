import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    char[] c = new char[n];
    c = s.toCharArray();

    if(c[k - 1] == 'A'){
      c[k - 1] = 'a';
    } else if(c[k - 1] == 'B'){
      c[k - 1] = 'b';
    } else {
      c[k - 1] = 'c';
    }

    for(int i = 0; i < n; i++){
      System.out.print(c[i]);
    }
  }
}
