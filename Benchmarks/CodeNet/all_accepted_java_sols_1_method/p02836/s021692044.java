import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    int n = c.length;
    int r = 0;
    for(int i=0;i<n/2;i++){
      if(c[i] != c[n-1-i]){
        r++;
      }
    }
    System.out.println(r);
  }
}