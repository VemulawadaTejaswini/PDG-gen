import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int total = x+y+z;
    
    if(total <= 21){
      System.out.println("win");
    }else{
      System.out.println("bust");
    }
    
  }
}
