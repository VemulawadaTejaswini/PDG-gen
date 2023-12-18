import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    
    int index;
    int cnt = 0;
    
    for(index = l; index % d != 0; index++){};
    
    for(int i = index; i <= r; i += d){
      cnt++;
    }
    
    System.out.println(cnt);
  }
}