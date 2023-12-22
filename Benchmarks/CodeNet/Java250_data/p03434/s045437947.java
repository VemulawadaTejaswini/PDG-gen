import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        Collections.sort(li, Comparator.reverseOrder());
        int ans = 0;
        int i = 0;
        for(int a: li){
            if(i % 2 == 0){
                ans += a;
            }else{
                ans -= a;
            }
            i++;
        }
        System.out.println(ans);
    }
}
