import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < k; i++){
            int[] b = new int[n];
            for(int j = 0; j < n; j++){
                b[j] += 1;
                for(int l = 1; l <= a[j]; l++){
                    if(j - l >= 0){
                        b[j - l] += 1;
                    }
                    if(j + l < n){
                        b[j + l] += 1;
                    }
                }
            }
            System.arraycopy(b, 0, a, 0, n);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : a) {
            sb.append(i).append("\n");
        }
        System.out.print(sb.toString());

    }
}
