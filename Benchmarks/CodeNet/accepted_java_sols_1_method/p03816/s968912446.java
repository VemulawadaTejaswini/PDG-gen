import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> freqMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
        int num = sc.nextInt();
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
      }
      int sum = 0;
      for(int freq : freqMap.values()) {
        sum += freq - 1;
      }
      if(sum % 2 == 0)
        System.out.println(freqMap.size());
      else
        System.out.println(freqMap.size() - 1);
  }
}