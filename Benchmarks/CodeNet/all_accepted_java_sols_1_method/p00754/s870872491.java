import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while(true){
      try{
        s = reader.readLine();
        if(s.equals(".")) break;
         Deque<Integer> ka = new ArrayDeque<>();//0 = [ 1 = (
         //Deque<Integer> ka2 = new ArrayDeque<>();//2 = ] 3 = )
        char[] c = s.toCharArray();
        int i = 0;
        for(char cs: c){
          if(cs == '(') ka.offerFirst(1);
          if(cs == '[') ka.offerFirst(0);
          if(cs == ')'){
            //ka2.offerFirst(3);
            if(ka.peek() == 1){
              ka.pollFirst();
              //ka2.pollFirst();
            }
            else{
              System.out.printf("no\n");
              break;
            }
          }
          if(cs == ']'){
            //ka2.offerFirst(2);
            if(ka.peek() == 0){
              ka.pollFirst();
              //ka2.pollFirst();
            }
            else{
              System.out.printf("no\n");
              break;
            }
          }
          if(i == s.length() - 1){
            if(ka.peek() == null /*&& ka2.peekFirst() == null*/){
              System.out.printf("yes\n");
              break;
            }
            else{
              System.out.printf("no\n");
              break;
            }
          }
          i++;
        }
      }catch(Exception e){
        System.out.printf("no\n");
      }
    }
  }
}
