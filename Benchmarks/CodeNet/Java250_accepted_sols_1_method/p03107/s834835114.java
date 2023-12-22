import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    int c1 = 0, c2 = 0;
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == '0'){
        c1++;
      }else{
        c2++;
      }
    }
    System.out.println(Math.min(c1,c2)*2);
  }
}