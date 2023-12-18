import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] place = new int[N];
        double sum = 0;
        
        
        for(int i = 0; i < N; i++) {
            place[i] = sc.nextInt();
            sum += place[i];
        }
        
        double av = sum / N;
        int intav = (int)av;
        if(av - intav >= 0.5) {
            intav += 1;
        }
        

        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans += Math.pow(place[i] - intav, 2);
        }
        
        System.out.println(ans);
        
    }
}