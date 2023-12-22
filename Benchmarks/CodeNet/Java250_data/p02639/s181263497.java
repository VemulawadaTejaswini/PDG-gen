import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    for(int i=0; i<5; i++){
      int x;
      x = sc.nextInt();

      if(x == 0){
        System.out.println(i+1);
        break;
      }
    }
    return;
  }
}