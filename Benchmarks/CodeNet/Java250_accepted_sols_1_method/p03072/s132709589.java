import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        int idx = 0;
        while(sc.hasNext()) N[idx++]=sc.nextInt();
        int max = N[0];
        int ans =1;
        for (int i=1;i<N.length;++i){
            if (N[i]>=max) {max = N[i];++ans;}
        }
        System.out.println(ans);
    }
}
