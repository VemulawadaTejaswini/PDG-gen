import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int m[] = new int[n];
    int sum = 0;
    int count = 0;
    for(int i = 0 ; i < n ; ++i){
      m[i] = sc.nextInt();
      sum += m[i];
      count++;
    }
    
    Arrays.sort(m);
    
    for(int i = 0 ; i < 100000 ; ++i){
      if(sum<x){
        sum += m[0];
        count++;
      }else{
        break;
      }
    }
    
    if(sum>x){
      count -= 1;
    }

    
    
    System.out.println(count);
    
  }
}
