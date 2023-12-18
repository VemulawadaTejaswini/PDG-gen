import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long march[] = new long[5];
        
        for(int i = 0; i < N; i++) {
            String S = sc.next();
            char x = S.charAt(0);
            
            switch(x){
                case 'M':
                    march[0]++;
                    break;
                case 'A':
                    march[1]++;
                    break;
                case 'R':
                    march[2]++;
                    break;
                case 'C':
                    march[3]++;
                    break;
                case 'H':
                    march[4]++;
                    break;
            }
        }
        
        long sum = 0;
        for(int a = 0; a < 3; a++) {
            for(int b = a + 1; b < 4; b++) {
                for(int c = b + 1; c < 5; c++){
                    sum += march[a] * march[b] * march[c];
                }
            }
        }
        
        System.out.println(sum);
        
    }
}
