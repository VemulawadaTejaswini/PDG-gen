import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0){
        break;
      }

      int s[] = new int[n];
      for(int i=0;i<n;i++){
        s[i] = sc.nextInt();
      }

      Arrays.sort(s);
      s[0] = 0;
      s[n-1] = 0;

      int ans = 0;
      for(int i=0;i<n;i++){
        ans += s[i];
      }
      ans = ans / (n-2);

      System.out.println(ans);
    }
  }
}
