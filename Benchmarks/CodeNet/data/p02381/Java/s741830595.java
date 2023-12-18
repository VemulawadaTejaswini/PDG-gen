import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        while(true) {
            double avg = 0, sum = 0, a = 0;
            int n = sc.nextInt();
            if(n == 0) break;
            int s[] = new int[n];

            for(i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            avg = sum / n;
            sum = 0;
            for(i = 0; i < n; i++) {
                sum += Math.pow(s[i] - avg, 2);
            }

            a = (double)sum / n;
            a = Math.sqrt(a);
            System.out.println(String.format("%.8f", a));
        }
        sc.close();
    }
}
