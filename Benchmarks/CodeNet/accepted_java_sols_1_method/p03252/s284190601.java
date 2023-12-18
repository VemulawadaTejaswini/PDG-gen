import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      String T = sc.next();
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      for (int i = 0; i < S.length(); i++) {
        if (hm.containsKey(S.charAt(i))) {
          hm.put(S.charAt(i), hm.get(S.charAt(i)) + 1);
        } else {
          hm.put(S.charAt(i), 1);
        }
      }
      HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
      for (int i = 0; i < T.length(); i++) {
        if (hm2.containsKey(T.charAt(i))) {
          hm2.put(T.charAt(i), hm2.get(T.charAt(i)) + 1);
        } else {
          hm2.put(T.charAt(i), 1);
        }
      }
      int[] arr1 = new int[hm.size()];
      int[] arr2 = new int[hm2.size()];
      int i = 0;
      for (Integer var : hm.values()) {
        arr1[i] = (int)var;
        i++;
      }
      i = 0;
      for (Integer var : hm2.values()) {
        arr2[i] = (int)var;
        i++;
      }
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      //System.out.println(Arrays.toString(arr2));
      if (arr1.length != arr2.length) {
        System.out.println("No");
        return;
      } else {
        for (int j = 0; j < arr1.length; j++) {
          if (arr1[j] != arr2[j]) {
            System.out.println("No");
            return;
          }
        }
        System.out.println("Yes");
      }
    }
  }
}
