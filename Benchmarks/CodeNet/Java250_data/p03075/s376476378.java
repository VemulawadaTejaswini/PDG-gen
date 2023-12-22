import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int a = Integer.parseInt(sc.nextLine());
      int b = Integer.parseInt(sc.nextLine());
      int c = Integer.parseInt(sc.nextLine());
      int d = Integer.parseInt(sc.nextLine());
      int e = Integer.parseInt(sc.nextLine());
      int k = Integer.parseInt(sc.nextLine());
      if((e - a) > k){
        System.out.println(":(");
      }else{
        System.out.println("Yay!");
      }
    }
  }
}