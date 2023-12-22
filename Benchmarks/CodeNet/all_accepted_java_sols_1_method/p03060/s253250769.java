import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    int[] value;
    value = new int[N];
    for( int i = 0 ; i < N ; i++ ){
      value[i] = sc.nextInt();
    }
    
    int[] cost;
    cost = new int[N];
    for( int i = 0 ; i < N ; i++ ){
      cost[i] = sc.nextInt();
    }
    
    int max = 0;
    for( int i = 0 ; i < N ; i++ ){
      if ( value[i] > cost[i] ){
        max += value[i] - cost[i] ;
      }
    }
    System.out.println(max);
    }
  }
