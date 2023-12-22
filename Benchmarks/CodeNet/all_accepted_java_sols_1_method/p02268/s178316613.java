import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] S = new int[n];
        for(int i=0;i<n;i++) S[i] = sc.nextInt();
        int q = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<q;i++){
            int t = sc.nextInt();
            int left = 0, right = n;
            while(left<right){
                int mid = (left+right)/2;
                if(S[mid]==t){
                    cnt++;
                    break;
                }
                else if(S[mid]>t) right = mid;
                else left = mid+1;
            }
        }
        System.out.println(cnt);
    }
}
