import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cardNum = sc.nextInt();
    
    List<Integer> numList = new ArrayList<>();
    
    while(sc.hasNextInt()){
      numList.add(sc.nextInt());
    }
    
    Collections.sort(numList, Collections.reverseOrder());
    
    int aliceSum = 0;
    int bobSum = 0;
    
    for(int i = 0; i < cardNum; i++){
      if(i % 2 == 0){
        aliceSum += numList.get(i);
      }else {
        bobSum += numList.get(i);
      }
      
    }
    
    System.out.println(aliceSum - bobSum);
  }

}