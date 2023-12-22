import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    int x = stdId.nextInt(); 
    int y = stdId.nextInt(); 
    while(x!=0 || y!=0){
      System.out.println(Math.min(x,y) + " " + Math.max(x,y));
      x = stdId.nextInt();
      y = stdId.nextInt();
    }
  }
}