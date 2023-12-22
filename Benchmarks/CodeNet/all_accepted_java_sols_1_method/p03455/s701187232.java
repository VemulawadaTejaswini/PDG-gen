import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1 = Integer.parseInt(scan.next());
    int num2 = Integer.parseInt(scan.next());
    
    if(((num1 * num2) % 2) == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
    
    scan.close();
    return ;
  }
}