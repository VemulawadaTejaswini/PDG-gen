import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i=0;i<n;i++)h[i]=sc.nextInt();
        boolean b = true;

        for (int i=n-1;i>=0&&b;i--){
            while (i>0&&h[i-1]<=h[i])i--;
            if (i>0)h[i-1]--;
            if (i>0&&h[i-1]>h[i])b=false;
        }
        if (b)System.out.println("Yes");
        else System.out.println("No");
    }
}
