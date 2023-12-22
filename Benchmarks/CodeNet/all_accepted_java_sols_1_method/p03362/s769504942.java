import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[55555];
        for (int i = 2; i < 55555; i++) {
            if(used[i])continue;
            if(i%5==1)list.add(i);
            int t = i;
            while(t < 55555){
                used[t] = true;
                t += i;
            }
        }
        System.out.println(list.subList(0, n).stream().map(i -> String.valueOf(i)).collect(Collectors.joining(" ")));
        sc.close();

    }

}
