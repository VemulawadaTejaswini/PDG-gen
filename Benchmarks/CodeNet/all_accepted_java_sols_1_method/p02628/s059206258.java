import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
      
        int ans = 0;
        for(int j = 0; j < k; j++){
            ans += list.get(j);
        }
        System.out.println(ans);
    }
}
