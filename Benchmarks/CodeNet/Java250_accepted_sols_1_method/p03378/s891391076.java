
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    

    List list = new ArrayList<>();
    for(int i = 0; i < m; i++){
      list.add(sc.nextInt());
    }

    int countA = 0;
    for(int i = x; i < n; i++){
      if(list.contains(i)){
        countA++;
      }
    }
    
    int countB = 0;
    for(int i = x; i > 0; i--){
      if(list.contains(i)){
        countB++;
      }
    }
    System.out.println(countA < countB ? countA : countB);
  }
}