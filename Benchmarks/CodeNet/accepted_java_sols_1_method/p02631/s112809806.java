import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int xor = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            xor ^= a[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i] ^ xor).append("\n");
        }

        System.out.println(sb);

    }
}
