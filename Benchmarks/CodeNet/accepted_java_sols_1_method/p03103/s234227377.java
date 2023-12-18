import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();

        int[][] priceList = new int[n][2];
        for (int i = 0; i < n; i++){
            priceList[i][0] = sn.nextInt();
            priceList[i][1] = sn.nextInt();
        }
        
        Arrays.sort(priceList, (l,r) -> {return l[0] - r[0];});
        
        long sum = 0;
        for (int[] price : priceList){
            if(m - price[1] >= 0) {
                sum += (long)price[0] * price[1];
                m -= price[1];
            } else {
                sum += (long)price[0] * m;
                break;
            }
        }
        
        System.out.println(sum);
    }
}