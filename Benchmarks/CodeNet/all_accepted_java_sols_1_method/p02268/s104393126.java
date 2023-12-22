import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int q = Integer.parseInt(br.readLine());
        String[] t = br.readLine().split(" ");
        
        int[] S = new int[n+1];
        int[] T = new int[q];
        
        for (int i = 0; i < n; i++) {
            S[i] = Integer.parseInt(s[i]);
        }
        
        for (int i = 0; i < q; i++) {
            T[i] = Integer.parseInt(t[i]);
        }
        
        int left = 0;
        int right = n;
        int mid = (left + right) / 2;
        //System.out.println(x);
        int count = 0;
        for (int i = 0; i < q; i++) {
            mid = n/2;
            left = 0;
            right = n;
            while (left < right) {
                //System.out.println("S: " + S[mid] + " T: " + T[i]);
                if (S[mid] == T[i]) {
                    count++;
                    break;
                }
                if (S[mid] < T[i]) {
                    //if (left == mid) break;
                    left = mid+1;
                    mid = (left + right) / 2;
                }
                else {
                    //if (left == mid) break;
                    right = mid;
                    mid = (left + right) / 2;
                }
                
            }
        }
        
        

        System.out.println(count);
    }
}




