import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan;
    String N;
    
    scan = new Scanner(System.in);
    N = scan.next();
    
    if (N.contains("7")){
    System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
