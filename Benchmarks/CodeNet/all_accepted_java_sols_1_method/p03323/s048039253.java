import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(0<a&&a<9&&0<b&&b<9){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }

  }
}