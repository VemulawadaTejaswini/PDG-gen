import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b){
      System.out.print(a+(a-1));
    }else if(a<b){
      System.out.print(b+(b-1));
    }else if(a==b){
      System.out.print(a*2);
    }
  }
}