import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int notUse = sc.nextInt();
    List<Integer> target = new ArrayList<Integer>();
    
    while(sc.hasNext()){
      target.add(sc.nextInt());
    }
    Collections.sort(target , Collections.reverseOrder());
    
    int Alice = 0;
    int Bob = 0;
    int count = 0;
    
    for(int i : target){
      if(count % 2 == 0){
      Alice += target.get(count);
      count++;
      
      }else{
      Bob += target.get(count);
      count++;
  }
}
    System.out.println(Alice - Bob);  
  }
}