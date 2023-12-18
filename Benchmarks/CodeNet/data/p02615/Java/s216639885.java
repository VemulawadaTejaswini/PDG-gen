import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
if(n<2){
            System.out.println(0);
            System.exit(0);
        }


        List<Long> list = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            list.add( sc.nextLong());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < n - 1; i++)
            sum += list.get(i);
        System.out.println(sum);
    }
}