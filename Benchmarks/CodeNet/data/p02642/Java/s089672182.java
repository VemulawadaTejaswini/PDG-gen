import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] str = sc.nextLine().split(" ");
    Integer[] intStr = new Integer[str.length];
    for(int i=0;i<str.length;i++) {
        intStr[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(intStr);
    List<Boolean> list = new ArrayList<Boolean>();
    for(int i=0;i<=Math.pow(10,6);i++) {
        list.add(true);
    }
    for(Integer num:intStr) {
        for(int j = num*2-1;j<=Math.pow(10,6);j+=num) {
            list.set(j, false);
        }
    }
    Map<Integer, Boolean> map = new HashMap<>();
    for(Integer num:intStr) {
        if(map.containsKey(num)) {
            map.put(num, false);
        }
        else {
            map.put(num, true);
        }
    }
    int cnt = 0;
    for(Integer num:intStr) {
        if(map.containsKey(num) && map.get(num)) {
            if(list.get(num-1)) {
                cnt++;
            }
        }
    }
    System.out.println(cnt);
  }
}