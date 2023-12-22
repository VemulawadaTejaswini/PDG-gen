import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] p = new int[4];
    for(int i = 0; i < 6; i++){
      p[sc.nextInt()-1]++;
    }
    int c = 0;
    for(int i = 0; i < 4; i++){
      if(p[i] == 1 || p[i] == 2){
        c++;
      }
    }
    System.out.println(c == 4 ? "YES" : "NO");
  }
}