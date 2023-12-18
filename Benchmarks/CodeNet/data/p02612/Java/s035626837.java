import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //値段
 	int n = sc.nextInt();
    for(int i = 0; i <= 10;i++){
      if(n <= i * 1000){
        System.out.println(i * 1000 - n);
        break;
      }
    }
  }
}