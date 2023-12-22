import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    int zIndex = Integer.MIN_VALUE;
    int aIndex = Integer.MAX_VALUE;
    for(int i=0; i<s.length(); i++){
      String S = String.valueOf(s.charAt(i));
      if(S.equals("A")){
        if(aIndex > i){
          aIndex = i;
        }
      } else if(S.equals("Z")){
        if(zIndex < i){
          zIndex = i;
        }
      }
    }
    System.out.println(zIndex-aIndex+1);

    sc.close();
  }
}
