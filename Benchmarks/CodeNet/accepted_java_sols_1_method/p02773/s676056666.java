import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> freq = new HashMap<>();
        int n = sc.nextInt();
        int maxFreq = 0;
        List<String> list = new ArrayList<>();
        String str = "";
        for(int i = 0; i < n; i++) {
          str = sc.next();
          freq.put(str, freq.getOrDefault(str, 0) + 1);
          if(maxFreq == freq.get(str)) {
            list.add(str);
          } else if (maxFreq < freq.get(str)) {
            maxFreq = freq.get(str);
            list = new ArrayList<>();
            list.add(str);
          }
        }
        Collections.sort(list);
        for(String s : list)
          System.out.println(s);
    }
}