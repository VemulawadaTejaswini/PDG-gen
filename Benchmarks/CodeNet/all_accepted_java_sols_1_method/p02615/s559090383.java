import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add( sc.nextLong());
        }
        Collections.sort(list, Collections.reverseOrder());
        long sum = list.get(0);
        if(n%2==0){
        for (int i = 1; i < n/2; i++)
           sum+=list.get(i) * 2;
        }
        else{
            for (int i = 1; i <= n/2-1; i++)
           sum+=list.get(i) * 2;
           sum+=list.get(n/2);
        }
        System.out.println(sum);
    }
}