import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    if(c.length==2){
      if(c[0]==c[1])System.out.println(1+" "+2);
      else System.out.println(-1+" "+-1);
      return;
    }
    for(int i = 0;i <= c.length-3;i++){
      char x = c[i];
      char y = c[i+1];
      char z = c[i+2];
      if(x==y||y==z||z==x){
        System.out.println((i+1)+" "+(i+3));
        return;
      }
    }
    System.out.println(-1+" "+-1);
  }
}