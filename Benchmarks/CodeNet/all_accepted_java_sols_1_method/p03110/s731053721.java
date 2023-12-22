import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        double a = 0;
        double b = 0;
        for(int i = 0; i < n; i++){
            double x = sc.nextDouble();
            String u = sc.next();
            if(u.compareTo("BTC") == 0){
                b += x;
            }
            else{
                a += x;
            }
        }
        ans = a + b * 380000;
        System.out.println(ans);
    }
}
 