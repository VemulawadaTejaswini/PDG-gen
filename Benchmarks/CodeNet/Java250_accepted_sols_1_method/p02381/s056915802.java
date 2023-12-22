import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n == 0) break;
            int[] s = new int[n];
            int sum = 0;
            double square = 0;
            for(int i=0; i<n; i++){
                s[i]=sc.nextInt();
                sum += s[i];
            }
            double avg = (double)sum / n;
            for(int i=0; i<n; i++){
                square += Math.pow(s[i]-avg, 2);
            }
            double variance = square / n;
            System.out.println(Math.sqrt(variance));
        }
    }
}
