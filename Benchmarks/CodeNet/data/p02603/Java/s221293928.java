import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        long money = 1000;
        long stock = 0;
        for (int i=0;i<n-1;i++){
            if (a[i]<a[i+1]){
                stock = money/a[i];
                money = money%a[i];
            }else {
                money +=stock*a[i];
                stock=0;
            }
        }
        money+=stock*a[n-1];
        System.out.println(money);
    }
}
