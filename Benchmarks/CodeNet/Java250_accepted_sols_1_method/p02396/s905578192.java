import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    int x = stdId.nextInt(); 
    for(int i=1;;i++){
      if(x==0) break;
      System.out.println("Case " + i + ": " + x);
      x = stdId.nextInt();
    }
  }
}