import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "Yes";

    Set<String> set = new HashSet<>();
    String w = sc.next();
    set.add(w);
    char siri = w.charAt(w.length()-1);
    

    for(int i = 0 ; i < n-1 ; ++i){
      w = sc.next();
      if(set.add(w) && siri==w.charAt(0)){
        siri = w.charAt(w.length()-1);
        set.add(w);
      }else{
        ans = "No";
      }
    }
    
    System.out.println(ans);

  }
}