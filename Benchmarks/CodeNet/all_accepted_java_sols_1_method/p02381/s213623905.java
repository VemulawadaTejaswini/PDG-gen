import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] s = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double m = (double)sum / n;
            double a = 0;
            for(int i = 0; i < n; i++){
                a += (s[i] - m) * (s[i] - m);
            }
            a /= n;
            a = Math.sqrt(a);
            System.out.println(a);
        }
    }
}
