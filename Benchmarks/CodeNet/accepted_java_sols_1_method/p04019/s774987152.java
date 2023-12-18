import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean N = false;
    boolean S = false;
    boolean E = false;
    boolean W = false;
    
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'N'){
        N = true;
      }else if(str.charAt(i) == 'S'){
        S = true;
      }else if(str.charAt(i) == 'E'){
        E = true;
      }else if(str.charAt(i) == 'W'){
        W = true;
      }
    }
    
    if(((N && S) || (!N && !S)) && ((E && W) || (!E && !W))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}