import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int n = Integer.parseInt(sc.nextLine());
      int a = Integer.parseInt(sc.nextLine());
      int hage = n % 500;
      if(a >= hage){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}