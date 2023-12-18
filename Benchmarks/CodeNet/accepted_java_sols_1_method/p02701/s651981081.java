import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    for(int i=0;i<n;i++){
      s[i] = sc.next();
    }
    int ans = 1;
    
    Arrays.sort(s);
    for(int i=1;i<n;i++){
      if(!s[i-1].equals(s[i]))
         ans += 1;
    }
    System.out.println(ans);
  }
}
