import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] num;
    num = new int[N];
    for ( int i = 0 ; i < N ; i++ ){
      num[i] = sc.nextInt();
    }
    
    int max = 0;
    int hotels = 0;
    for ( int i=0 ; i < N ; i++ ){
      if(max<=num[i]){
        hotels ++ ;
        max = num[i];
      }
    }
    System.out.println(hotels);
  }
}