import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int[][] data = new int[n][2];
        for (int i=0;i<n;i++){
            String s = sc.next();
            int count = 0;
            boolean b = true;
            for (int j=0;j<s.length();j++){
                if (!b)count++;
                if (s.charAt(j)!='.'){
                    a[i]=a[i]*10+s.charAt(j)-'0';
                }else {
                    b=false;
                }
            }
            while (count<9){
                a[i]*=10;
                count++;
            }
            long ins = a[i];
            while (ins%2==0){
                ins/=2;
                data[i][0]++;
            }
            ins = a[i];
            while (ins%5==0){
                ins/=5;
                data[i][1]++;
            }
        }
        //10^18=2^18 * 5^18 => data[i][0]+data[j][0]>=18&&data[i][1]+data[j][1]>=18;
        int ans = 0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (data[i][0]+data[j][0]>=18&&data[i][1]+data[j][1]>=18)ans++;
            }
        }
        System.out.println(ans);
    }
}
