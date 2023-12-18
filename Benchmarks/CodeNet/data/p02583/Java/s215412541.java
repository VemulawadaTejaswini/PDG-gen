import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int ans = 0;
        List<Integer> l = Arrays.asList(sc.nextLine().split(" ")).stream().map(numStr -> Integer.valueOf(numStr)).collect(Collectors.toList());
        Collections.sort(l);
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    if(l.get(i).equals(l.get(j)) || l.get(j).equals(l.get(k))) continue;
                    if(l.get(i) + l.get(j) > l.get(k)) ans++;
                    else break;
                }
            }
        }
        System.out.println(ans);
    }
}