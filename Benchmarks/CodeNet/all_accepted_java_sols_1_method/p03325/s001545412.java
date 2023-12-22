import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int sumDiv2 = 0;
    for(int i = 0 ; i < N ; i ++){
      int a = sc.nextInt();
      while( a % 2 == 0 ){
        sumDiv2 ++ ;
        a = a / 2;
      }
    }
    System.out.println(sumDiv2);
  }
}
