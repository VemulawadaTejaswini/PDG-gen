import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = 0, max = 0;
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == 'A' || S.charAt(i) == 'C'
        	|| S.charAt(i) == 'G' || S.charAt(i) == 'T'){
        n++;
      }else{
        n = 0;
      }
      
      max = n > max ? n : max;
    }
    System.out.println(max);
  }
}