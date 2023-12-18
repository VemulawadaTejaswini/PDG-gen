import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    switch (A){
    case 1:
      if (B==2){
        System.out.println("3");
      } else {
        System.out.println("2");
      }
      break;
    case 2:
      if (B==1){
        System.out.println("3");
      } else {
        System.out.println("1");
      }
      break;
    case 3:
      if (B==1){
        System.out.println("2");
      } else {
        System.out.println("1");
      }
      break;
    }
  }
}