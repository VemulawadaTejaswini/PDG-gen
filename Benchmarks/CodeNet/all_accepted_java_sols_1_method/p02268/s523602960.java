import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //数列Sの長さ
        int[] s = new int[n]; //数列S
        for(int i=0; i<n; i++) {
            s[i] = sc.nextInt();
        }

        int q = sc.nextInt(); //数列Tの長さ
        int count = 0; //出力結果（個数）
        int left,right,mid,t;

        for(int i=0; i<q; i++) {
            left = 0;
            right = n-1;
            t = sc.nextInt();
            while(left<=right) {
                mid = (left+right)/2;
                if(s[mid] < t) {
                    left = mid+1;
                } else if (s[mid] > t) {
                    right = mid-1;
                } else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

