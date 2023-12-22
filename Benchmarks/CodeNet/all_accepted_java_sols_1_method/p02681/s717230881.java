import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      String str = "No";
      
     if(T.length() == S.length()+1){
      for(int i=0; i<S.length(); i++){
        if(S.charAt(i) == T.charAt(i)){
          if(i == S.length()-1){
            str = "Yes";
          }
        }else{
          break;
        }
      }
     }
        
      System.out.println(str);
   }
}