import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    for(int i=1;;i++){
      int no = scan.nextInt();
      if(no == 0) break;
      System.out.println("Case " + i + ": " + no);
    }
  }
}