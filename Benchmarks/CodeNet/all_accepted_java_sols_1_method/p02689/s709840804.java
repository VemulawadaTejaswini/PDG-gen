import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int h[] = new int[n];
    boolean ju[] = new boolean[n];

    for(int i = 0 ; i < n ; ++i){
      h[i] = sc.nextInt();
      ju[i] = true;
    }
    
    for(int i = 0 ; i < m ; ++i){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(h[a-1]>=h[b-1]) ju[b-1]=false;
      if(h[a-1]<=h[b-1]) ju[a-1]=false;
    }
    
    int count = 0;
    for(int i = 0 ; i < n ; ++i){
      if(ju[i]) count++;
    }
    System.out.println(count);

  }
}