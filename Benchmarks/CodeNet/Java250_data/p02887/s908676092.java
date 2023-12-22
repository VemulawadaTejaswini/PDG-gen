import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();  
    StringBuilder s = new StringBuilder();
    s.append(S.charAt(0)); 
    for(int i=1;i<S.length();i++){
        if(S.charAt(i-1)!=S.charAt(i)){
            s.append(S.charAt(i));
        }
    }
    System.out.print(s.length());
    return;
  }
}

