import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int ans = 0;
        for (int i=0;i<n;i++){
            while (i<n-1&&c[i]==c[i+1])i++;
            ans++;
        }
        System.out.println(ans);
    }
}
