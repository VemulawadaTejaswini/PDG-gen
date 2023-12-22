import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] march = {'M','A','R','C','H'};
        long[] a = new long[5];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            char f = s.charAt(0);
            for(int j = 0; j < 5; j++){
                if(march[j] == f){
                    a[j]++;
                    break;
                }
            }
        }
        long ans = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                for(int k = j+1; k < 5; k++){
                    ans += (a[i] * a[j] * a[k]); 
                }
            }
        }
        System.out.println(ans);
    }
}