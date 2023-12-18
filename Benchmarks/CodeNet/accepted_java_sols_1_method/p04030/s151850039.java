import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    Deque<Integer> deq = new ArrayDeque<>();
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == '0'){
        deq.push(0);
      }else if(S.charAt(i) == '1'){
        deq.push(1);
      }else if(deq.size() > 0){
        deq.pop();
      }
    }
    String ans = "";
    while(deq.size() > 0){
      ans = deq.pop() + ans;
    }
    
    System.out.println(ans);
  }
}