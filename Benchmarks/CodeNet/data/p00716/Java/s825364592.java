import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            int money = scan.nextInt();
            int year = scan.nextInt();
            int n = scan.nextInt();
            int max = 0;
            for(int j=0; j<n; j++){
                int method = scan.nextInt();
                double rate = scan.nextDouble();
                int fee = scan.nextInt();
                if(method == 0){
                    int m = Simple(money, year, rate, fee);
                    if(max < m){
                        max = m;
                    }
                } else {
                    int m = Compound(money, year, rate, fee);
                    if (max < m) {
                        max = m;
                    }
                }
            }
            System.out.println(max);
        }
    }

    public static int Simple(int money, int year, double rate, int fee){
        int result = money, interest = 0;
        for(int i=0; i<year; i++){
            interest += (result * rate);
            result -= fee;
        }
        result += interest;
        return result;
    }

    public static int Compound(int money, int year, double rate, int fee){
        int result = money;
        for(int i=0; i<year; i++){
            result += result * rate;
            result -= fee;
        }
        return result;
    }

}