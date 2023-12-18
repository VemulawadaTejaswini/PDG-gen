import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        sc.close();
        boolean flag = true;
        int[] ans = new int[n];

        int Lorigin = 0;
        int Rorigin = 0;
        for(int i=0;i<n;i++){
            if(s[i]=='R' && !flag){
               Rorigin = i;
               flag = true;
               ans[Lorigin-1] += (i-Lorigin)/2;
               ans[Lorigin] += (i-Lorigin+1)/2;
            }else if(s[i]=='L' && flag){
                Lorigin = i;
                flag = false;
                ans[i-1]+=(i-Rorigin+1)/2;
                ans[i]+=(i-Rorigin)/2;
            }

        }
        ans[Lorigin-1] += (n-Lorigin)/2;
        ans[Lorigin] += (n-Lorigin+1)/2;
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<n;i++){
            out.printf("%d ", ans[i]);
        }
        out.flush();

    }

}