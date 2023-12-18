import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i = 0;i<n;i++)list.add(sc.nextLong());
        long ans = 0;
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 1;i<n;i++)ans+=list.get(i/2);
        System.out.println(ans);
    }
}