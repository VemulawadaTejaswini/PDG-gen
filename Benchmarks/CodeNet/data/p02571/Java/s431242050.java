import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    
    int ans = 1001;

    for(int i=0; i<s.length()-t.length()+1; i++){
        String sub = s.substring(i, i+t.length());
        int sum = 0;
        for(int j=0; j<t.length(); j++){
            if(t.charAt(j) != sub.charAt(j)){
                sum++;
            }
        }
        ans = Math.min(sum, ans);
    }
    System.out.println(ans);
   
    sc.close();
    return;
  }
  
}
