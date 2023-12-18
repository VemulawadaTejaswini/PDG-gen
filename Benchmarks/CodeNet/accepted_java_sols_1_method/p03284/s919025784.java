import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int num = sc.nextInt();
    if(total % num == 0){
      System.out.println(0);
    }else{
      System.out.println(1);
    }
    
  }
}