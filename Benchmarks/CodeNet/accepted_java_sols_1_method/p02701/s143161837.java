import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    String s[] = new String[n];

    for(int i=0 ; i<n ; i++){
      s[i] = sc.next();
    }
    Arrays.sort(s);
    for(int i=0 ; i<n-1 ; i++){
      if(s[i].equals(s[i+1])){
        count++;
      }
    }
    System.out.println(n-count);
  }
}
