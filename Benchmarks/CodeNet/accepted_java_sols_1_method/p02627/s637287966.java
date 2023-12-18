import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String alp[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    boolean check = false;
    for(String aa: alp){
      if(aa.equals(s)){
        check = true;
        break;
      }
    }
    if(check){
      System.out.println("a");
    }else{
      System.out.println("A");
    }
  }
}
