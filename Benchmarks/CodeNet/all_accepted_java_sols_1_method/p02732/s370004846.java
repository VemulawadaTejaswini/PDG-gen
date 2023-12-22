import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    HashMap<Long, Long> num1 = new HashMap<Long, Long>();
    HashMap<Long, Long> num2 = new HashMap<Long, Long>();
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
      if(!num1.containsKey(a[i])){
        num1.put(a[i],(long)1);
      }else{
        num1.put(a[i],num1.get(a[i])+1);
      }
    }
    long sum = 0;
    long ans = 0;
    
    for(long i : num1.keySet()){
      num2.put(i, num1.get(i) * (num1.get(i)-1) / 2);
      sum += num1.get(i)*(num1.get(i)-1)/ 2;
    }
    for (int i = 0 ; i < n ; ++i) {
      ans = sum-num2.get(a[i])+(num1.get(a[i])-1)*(num1.get(a[i])-2)/2;
      System.out.println(ans);
    }
  }
}