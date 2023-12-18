import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int k = sc.nextInt();

      ArrayList<Integer>[] arr = new ArrayList[26];
      for(int i = 0; i < 26; i++)
        arr[i] = new ArrayList<>();

      for(int i = 0; i < s.length(); i++)
        arr[s.charAt(i)-'a'].add(i);

      for(int i = 0; i < 26; i++) 
        Collections.sort(arr[i], (a, b) -> s.substring(a).compareTo(s.substring(b)));

      for(int i = 0; i < 26; i++) {
        ArrayList<Integer> idxArr = arr[i];
        Set<String> substrs = new HashSet<>();
        for(int idx : idxArr) {
            for(int j = 0; j + idx < s.length(); j++) {
                String str = s.substring(idx, idx + j + 1);
                substrs.add(str);
                if(substrs.size() == k) {
                    System.out.println(str);
                    return;
                }
            }
        }
        
        k -= substrs.size();
      }
  }
}