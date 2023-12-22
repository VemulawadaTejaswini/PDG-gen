import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[1000];
        double sum=0.0, avg,alpha;
        
        while(n!=0){
            sum = 0.0;
            for(int i=0; i<n; i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            avg = sum/n;
            sum = 0.0;
            for(int i=0; i<n; i++){
                sum += (s[i] - avg)*(s[i] - avg);
            }
            alpha = Math.sqrt(sum/n);
            System.out.println(alpha);
            n = sc.nextInt();
        }
    }
}