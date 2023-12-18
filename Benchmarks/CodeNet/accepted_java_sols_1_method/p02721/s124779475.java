
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        char[] chars = sc.next().toCharArray();

        int[] left = new int[N];
        int[] right= new int[N];

        int count = 0;

        int lcount =0;
        for (int i = 0; i < N; i++) {
            if(chars[i]=='o'){
                left[i] = ++lcount;
                i+=C;
            }
            if(lcount==K) break;
        }
        int rcount =0;
        for (int i = N-1; i >= 0; i--) {
            if(chars[i]=='o'){
                right[i] = K-rcount;
                ++rcount;
                i-=C;
            }
            if(rcount==K) break;
        }


        for (int i = 0; i < N ; i++) {
            if(left[i]==right[i] && right[i]!=0){
                System.out.println(i+1);
            }
            
        }

    }

}
