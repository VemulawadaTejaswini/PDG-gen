import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for (int i=a;i<10000000;i++){
      boolean find = false;
      for (int j=2;j<i;j++){
        if (i%j == 0){
          find = true;
          break;
        }
      }
      if (find == false){
        System.out.println(i);
        break;
      }
    }
  }
}
