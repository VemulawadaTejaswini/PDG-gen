import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int idx=0;
    if((idx=s.indexOf('C'))!=-1){
      if(s.indexOf('F',idx)!=-1){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}