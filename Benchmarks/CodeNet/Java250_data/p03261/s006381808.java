import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    Set<String> set = new HashSet<String>();
    for(int i = 0;i<n;i++){
      s[i] = sc.next();
      set.add(s[i]);
    }
    if(set.size() != n){
      System.out.println("No");
      return;
    }
    for(int i = 0;i<n-1;i++){
      if(!(s[i].substring(s[i].length()-1,s[i].length()).equals(s[i+1].substring(0,1)))){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
