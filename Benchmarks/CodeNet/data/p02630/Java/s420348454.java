import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int q = Integer.parseInt(br.readLine());
        int[][] qarr = new int[q][2];
        for(int i=0; i<q;i++) {
            String[] t = br.readLine().split(" ");
            qarr[i][0] = Integer.parseInt(t[0]);
            qarr[i][1] = Integer.parseInt(t[1]);
        }
        int[] carr = new int[100000];
        long k = 0;
        for(int i=0; i<n;i++) {
            carr[arr[i]-1]+=1;
            k+=(long)arr[i];
        }
        for(int i=0; i<q;i++) {
            long a = (long)carr[qarr[i][0]-1];
            long b = (long)qarr[i][0];
            long c = (long)qarr[i][1];
            k-=a*b;
            k+=a*c;
            carr[qarr[i][1]-1]+=a;
            a=0;
            System.out.println(k);
        }
    }
}
