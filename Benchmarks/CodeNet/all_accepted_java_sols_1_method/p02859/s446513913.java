import java.util.*;
 
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int r = sc.nextInt();
    
    //円の面積を求める。(π除く)
    int rr = r*r;
      
    //半径1なので倍率は円の面積でよい。
    System.out.println(rr);
    
    }
      
 }