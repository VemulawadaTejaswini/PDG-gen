import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int W [] = new int [N];
        int min = 0,opt=0,sum=0;
        for(int i=0;i<N;i++) {
            W[i] = sc.nextInt();
            sum += W[i];
            if (min < W[i]) min = W[i];
        }
        while(min<sum){
            int mid = (min+sum)/2;
            int track_num = 1,weight=0;
            if(K==1){
                opt = sum;
                break;
            }
            for(int i:W) {
                if (weight + i <= mid) weight += i;
                else {
                    weight=i;
                    track_num++;
                }
            }
            if(track_num<=K) {
                sum=mid;
                opt = mid;
            }
            else min = mid+1;
        }
        System.out.println(opt);
    }
}
