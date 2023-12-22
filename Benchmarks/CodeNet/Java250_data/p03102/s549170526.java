import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        int b[] = new int[m];

        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }
        sc.nextLine();

        int ans = 0;
        int tmp = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                tmp += sc.nextInt()*b[j];
            }
            sc.nextLine();
            if(tmp + c > 0){
                ans++;
            }
            tmp = 0;
        }

        System.out.println(ans);
    }
}