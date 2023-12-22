import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> even = new HashMap<>();
    Map<Integer, Integer> odd = new HashMap<>();
    for(int i = 0; i < N; i++){
      int a = sc.nextInt();
      Map<Integer, Integer> tmpMap = (i % 2 == 0) ? even : odd;
      int count = 1;
      if(tmpMap.containsKey(a)){
        count += tmpMap.get(a);
      }
      tmpMap.put(a, count);
    }
    int[] maxEven = new int[2];
    int[] maxEvenKey = new int[2];
    int[] maxOdd  = new int[2];
    int[] maxOddKey = new int[2];
    maxEven[0] = 0;
    maxEven[1] = 0;
    maxOdd[0] = 0;
    maxOdd[1] = 0;
    for(int key : even.keySet()){
      int tmp = even.get(key);
      if(maxEven[0] < tmp){
        maxEven[1] = maxEven[0];
        maxEven[0] = tmp;
        maxEvenKey[1] = maxEvenKey[0];
        maxEvenKey[0] = key;
      }else if(maxEven[1] < tmp){
        maxEven[1] = tmp;
        maxEvenKey[1] = key;
      }
    }
    for(int key : odd.keySet()){
      int tmp = odd.get(key);
      if(maxOdd[0] < tmp){
        maxOdd[1] = maxOdd[0];
        maxOdd[0] = tmp;
        maxOddKey[1] = maxOddKey[0];
        maxOddKey[0] = key;
      }else if(maxOdd[1] < tmp){
        maxOdd[1] = tmp;
        maxOddKey[1] = key;
      }      
    }
    if(maxEvenKey[0] != maxOddKey[0]){
      System.out.println(N - (maxEven[0] + maxOdd[0]));
    }else if(maxEven[0] + maxOdd[1] > maxOdd[0] + maxEven[1]){
      System.out.println(N - (maxEven[0] + maxOdd[1]));
    }else{
      System.out.println(N - (maxOdd[0] + maxEven[1]));
    }
  }
}
