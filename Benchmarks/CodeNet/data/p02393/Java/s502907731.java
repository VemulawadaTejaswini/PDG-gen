import java.util.Scanner;

public class Main{
 public static void(String[] args){
  Scanner sc = new Scanner(System.in);
  int a =  sc.nextInt();
  int b =  sc.nextInt();
  int c =  sc.nextInt();
  if(a<b){
    if(b<c){
     System.out.plintf("%d %d %d ?\n", a,b,c);
    }else if(a<c){
     System.out.plintf("%d %d %d ?\n", a,c,b);
    }else{
      System.out.plintf("%d %d %d ?\n", c,a,b);
    }
   }else{
     if(a<c){
     System.out.plintf("%d %d %d ?\n", b,c,a);
    }else if(b<c){
     System.out.plintf("%d %d %d ?\n", b,c,a);
    }else{
      System.out.plintf("%d %d %d ?\n", c,b,a);
    }
  }
}