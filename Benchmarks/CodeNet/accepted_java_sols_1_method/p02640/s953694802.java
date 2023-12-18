import java.util.*;

class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      //動物の数
    int x = sc.nextInt();
    //足の数
    int y = sc.nextInt();
    for(int i = 0; i <= x;i++){
      for(int j = 0; j <= x; j++){
        if(i + j == x && (2 * i + 4 * j == y)){
          System.out.print("Yes");
          return;
        }
      }
    }
    System.out.print("No");
  }
}