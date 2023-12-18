import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Lz = new int[N];
        for (int i = 0; i < N; i++){
            Lz[i] = sc.nextInt();
        }
        Arrays.sort(Lz);
        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < i; j++){
                for (int k = 0; k < j; k++){
//                    System.out.println(i+" "+j+" "+k);
//                    System.out.println(Lz[i]+" "+Lz[j]+" "+Lz[k]);
//                    System.out.println((Lz[i] != Lz[j])+" "+(Lz[j] != Lz[k])+" "+(Lz[j] + Lz[k] > Lz[i]));
                    if ((Lz[i] != Lz[j]) && (Lz[j] != Lz[k]) && (Lz[j] + Lz[k] > Lz[i])){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}