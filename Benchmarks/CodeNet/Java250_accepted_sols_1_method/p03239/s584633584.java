import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());

        int[] costAr = new int[n];
        int[] timeAr = new int[n];

        for (int i = 0; i < n; i++) {
            costAr[i] = Integer.parseInt(sc.next());
            timeAr[i] = Integer.parseInt(sc.next());
        }

        int num = 1001;
        for (int i = 0; i < n; i++) {
            if (costAr[i] < num && timeAr[i] <= t){
                num = costAr[i];
            }
        }
        if (num == 1001){
            System.out.println("TLE");
        }else{
            System.out.println(num);

        }
    }
}
