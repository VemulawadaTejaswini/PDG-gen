import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int s[] = new int[n];
    
    for(int i = 0; i < n; i++){
      s[i] = sc.nextInt();
    }
    int cnt = 0;
    for(int i = 0; i < n-1; i++){
      if(s[i] == 0)
        continue;
      for(int j = i+1; j < n; j++){
        if(s[j] == 0)
          continue;
        cnt += (s[i] * s[j]) % 200003;
      }
    }
    System.out.print(cnt);
  }
}