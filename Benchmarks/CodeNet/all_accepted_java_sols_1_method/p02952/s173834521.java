import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    String s = "";
    for(int i=1;i<=n;i++){
      s = String.valueOf(i);
      if(s.length()%2 == 1){
        count++;
      }
    }
    System.out.println(count);
  }
}