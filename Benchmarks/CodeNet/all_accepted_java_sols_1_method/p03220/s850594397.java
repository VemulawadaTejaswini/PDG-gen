import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double min = Double.MAX_VALUE;
        int ans = 0;
        for(int i = 1;i <= n;i++){
            double tpr = Math.abs(a-(t - sc.nextInt()*0.006));
            if(min > tpr){
                min = tpr;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
