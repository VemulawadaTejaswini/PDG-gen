import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int t,mid,r,l,cnt=0;
        for(int i = 0; i < q; i++){
            t = sc.nextInt();
            l = 0;
            r = n - 1;
            while ( l <= r ){
                mid = (l + r) / 2;
                if(s[mid] == t) {
                    cnt++;
                    break;
                }
                else if (s[mid] > t) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        System.out.printf("%d%n",cnt);
    }
}

