import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] isP = new boolean[55556];
    for(int i = 2; i <= 55555; i++) {
      isP[i] = true;
    }
    for(int i = 2; i <= 55555; i++) {
      if(isP[i]) {
        for(int j = (2 * i); j <= 55555; j += i) {
          isP[j] = false;
        }
      }
    }
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    ArrayList<Integer> list4 = new ArrayList<Integer>();
    for(int i = 2; i <= 55555; i++) {
      if(isP[i]) {
        if((i % 5) == 1) list1.add(i);
        if((i % 5) == 2) list2.add(i);
        if((i % 5) == 3) list3.add(i);
        if((i % 5) == 4) list4.add(i);
      }
    }
    ArrayList<Integer> ans = new ArrayList<Integer>();
    if(list1.size() >= n) {
      for(int i = 0; i < n; i++) { 
        ans.add(list1.get(i));
      }
    } else if(list2.size() >= n) {
      for(int i = 0; i < n; i++) { 
        ans.add(list2.get(i));
      }
    } else if(list3.size() >= n) {
      for(int i = 0; i < n; i++) { 
        ans.add(list3.get(i));
      }
    } else {
      for(int i = 0; i < n; i++) { 
        ans.add(list4.get(i));
      }
    }
    for(int i = 0; i < n; i++) { 
      System.out.println(ans.get(i));
    }
  }
}