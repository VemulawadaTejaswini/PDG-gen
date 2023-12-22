import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String S = scan.next();
        String cnt;
        
        //パターンはOOXX,OXOX,OXXOの3パターンで文字が同じか調べればよいだけ
        
        if(S.substring(0,1).charAt(0) == S.substring(1,2).charAt(0) &&
          S.substring(2,3).charAt(0) == S.substring(3,4).charAt(0))
          cnt = "Yes";
        else if(S.substring(0,1).charAt(0) == S.substring(2,3).charAt(0) &&
          S.substring(1,2).charAt(0) == S.substring(3,4).charAt(0))
          cnt = "Yes";
        else if(S.substring(0,1).charAt(0) == S.substring(3,4).charAt(0) &&
          S.substring(1,2).charAt(0) == S.substring(2,3).charAt(0))
          cnt = "Yes";
        else
          cnt = "No";
        
        if(S.substring(0,1).charAt(0) == S.substring(1,2).charAt(0) &&
           S.substring(1,2).charAt(0) == S.substring(2,3).charAt(0) &&
           S.substring(2,3).charAt(0) == S.substring(3,4).charAt(0) )
          cnt = "No";
            
        System.out.println(cnt);
	  }
}