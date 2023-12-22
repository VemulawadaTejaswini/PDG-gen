import java.util.*;
class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int A=sc.nextInt(),B=sc.nextInt();
    for(int i=1;i<=3;i++){
      if(i!=A&&i!=B){
        System.out.println(i);
        break;
      }
    }
  }
}