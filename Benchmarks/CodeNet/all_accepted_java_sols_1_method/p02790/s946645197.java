import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ss;
    char ac,bc;
    ss = sc.next();
    ac = ss.charAt(0);
    ss = sc.next();
    bc = ss.charAt(0);
    
    int a = ac - '0';
    int b = bc - '0';
    int s = b;
    char wakame = ac;
    if(a>b){
      s = a; wakame = bc;
    }
    
    for(int i=0; i<s; ++i){
      System.out.print(wakame);
    }
  }
}