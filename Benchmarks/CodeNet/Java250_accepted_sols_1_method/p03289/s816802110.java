import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String[] AC = S.split(""); //1文字ずつ分割
    boolean ans = true; 
    int cnt = 0;
    
    if(AC[0].equals("A")){//1文字目＝A
      for(int i = 1; i < AC.length; i++){
        if(AC[i].toUpperCase().equals(AC[i])){//大文字の数を判定
          if(i == 1 || i == AC.length-1){
            ans = false;
          }else{
            if(AC[i].equals("C")){//3文字目までにC
              cnt ++;
            }else{
              ans = false;
            }
          }
        }
      }
    }else{
      ans = false;
    }
    if(cnt != 1){
      ans = false;
    }
        if(ans){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}
