import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] count = new int[ N ] ;

    for( int i = 0 ;i < N ; i ++ ){
      int A = sc.nextInt();
      count[ A ] ++ ;
    }

    boolean isReal = true;
    if( N % 2 == 0  ){
      for( int i = 1 ;  i < N ; i = i + 2 ){
        if( count[ i ] != 2 ){
          isReal = false;
          break;
        }
      }
    }else{
      for( int i = 0 ;  i < N ; i = i + 2 ){
        if(i == 0 && count[ i ] != 1 ){
          isReal = false;
          break;
        }
        if(i != 0 && count[ i ] != 2 ){
          isReal = false;
          break;
        }
      }
    }
    long result = 1L;
    if( !isReal ){
      result = 0L;
    }else{
      for( int i = 0 ;i < N / 2 ; i ++){
        result = result * 2;
        if(result > 1000000007L ){
          result = result - 1000000007L ;
        }
      }
    }
    System.out.println(result);
  }
}
