import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int n = sc.nextInt();

    int total = 0;
    for(int i = 0; i < n; i++){
      total += sc.nextInt();
      if( total >= h ){
        break;
      }
    }

    if( total < h ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
