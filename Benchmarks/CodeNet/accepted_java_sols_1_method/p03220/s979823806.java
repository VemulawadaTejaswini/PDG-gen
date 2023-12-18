import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }

        double diff = Double.MAX_VALUE;
        int ans = -1;
        for(int i = 0;i < n;i++){
            double temp = t - (double)list.get(i) * 0.006;
            if((Math.abs(a-temp)) < diff){
                diff = Math.abs(a-temp);
                ans = i+1;
            }
        }
        System.out.println(ans);
    }

}