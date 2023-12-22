import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        logic cal = new logic();
        System.out.println(cal.calc());
    }

    public static class logic{
        private double a = 0, b = 0;
        private double ans;
        private int ret;

        private int calc(){
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
          	sc.close();
    
            ans = (b - 1) / (a - 1);
            if (ans % 1 != 0) {
                ret = (int)ans + 1;
            }else{
                ret = (int)ans;
            }
            
            return ret;
        }
    }

}