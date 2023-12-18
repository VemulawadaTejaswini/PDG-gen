import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int total = 0;
    if(a<b){
      total += a;
      if(b<c){
        total += b;
      }else{
        total += c;
      }
    }else{
      total += b;
      if(a<c){
        total += a;
      }else{
        total += c;
      }
    }            
    System.out.println(total);
  } 
}