
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String O = sc.next();
    String E = sc.next();
    String ans = "";
    if(O.length()==E.length()){
      for(int i=0;i<O.length();i++){
        ans=ans+O.substring(i, i+1);
        ans=ans+E.substring(i, i+1);
      }
    }else{
      for(int i=0;i<E.length();i++){
        ans=ans+O.substring(i, i+1);
        ans=ans+E.substring(i, i+1);
      }
      ans=ans+O.substring(O.length()-1);
    }
    System.out.println(ans);
  }
  

  
}
