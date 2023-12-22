import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> visited = new HashSet<>();
        int cnt = 0;
        while(n > 0) {
          n--;
          int num = sc.nextInt();
          if(visited.contains(num)) continue;
          visited.add(num);
          cnt++;
        }
        System.out.println(cnt);
    }
}