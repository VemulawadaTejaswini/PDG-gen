import java.util.Scanner;
public class Main {
    static double num = 380000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for(int i = 0 ; i < n ; i++){
            double val = sc.nextDouble();
            char type = sc.next().charAt(0);
            if(type == 'J'){
                ans += val;
            } else {
                ans += val * num;
            }
        }
        System.out.println(ans);
    }
}