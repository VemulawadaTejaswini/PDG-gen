import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out = 0;
        for(int i = 1; i < n; i++){
            int mod = n % i;
            int div = n / i;
            if(mod == 0){
                div--;
            }
            out+=div;
        }
        System.out.println(out);
    }
}
