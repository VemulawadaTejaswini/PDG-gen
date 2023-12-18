import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt()-1;
    int b = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int d = sc.nextInt()-1;
    String s = sc.next();
    
    boolean ans = true;
    boolean ju1 = false;
    boolean ju2 = false;
    
    //空欄
    for(int i = b-1 ; i < d ; ++i){
      if(i+2 >= n) break;
      if(s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.') {
        ju1 = true;
        break;
      }
    }
    //岩
    for(int i = a ; i < c ; ++i){
      if(i+1 >= n) break;
      if(s.charAt(i)=='#' && s.charAt(i+1)=='#') {
        ju2 = true;
        break;
      }
    }
    
    for(int i = b ; i < d ; ++i){
      if(i+1 >= n) break;
      if(s.charAt(i)=='#' && s.charAt(i+1)=='#') {
        ju2 = true;
        break;
      }
    }
    
    //追い越すとき3マス空欄必要
    if(d<c && ju1==false) ans = false;
    //岩2マス並んでたらアウト
    else if(ju2) ans = false;
    
    if(ans) System.out.println("Yes");
    else System.out.println("No");
    
  }
}