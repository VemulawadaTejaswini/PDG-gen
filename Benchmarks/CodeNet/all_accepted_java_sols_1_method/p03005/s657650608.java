import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    
    if(k == 1){
      System.out.println(0);
    }else{
      System.out.println(n-k);
    }
  }
}
