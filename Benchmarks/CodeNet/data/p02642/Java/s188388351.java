import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }
        Arrays.sort(a);
        int count=0;
        for (int i=0;i<n;i++){
            boolean b = true;
            for (int j=0;j<i&&b;j++){
                if (a[i]%a[j]==0)b=false;
            }
            if (b)count++;
        }
        if (a.length>1){
            if (a[0]==a[1])count--;
        }
        System.out.println(count);
    }
}