import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int l=0;
    int ret=0;
    for(char c: S.toCharArray()){
      switch(c){
        case 'A':
        case 'T':
        case 'C':
        case 'G':
          l++; break;
        default:
          l=0;
      }
      ret = Math.max(ret, l);
    }
    System.out.println(ret);
  }
}