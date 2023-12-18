import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                        b[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(a);
                Arrays.sort(b);
                double owata = 0;
                double yokun = 0;
                if(n % 2 == 0){
                        owata = a[n / 2 - 1] + a[n / 2];
                        owata /= 2.0;
                        yokun = b[n / 2 - 1] + b[n / 2];
                        yokun /= 2.0;
                        yokun -= owata;
                        System.out.println((int)(yokun * 2) + 1);
                }else{
                        System.out.println(b[n / 2] - a[n / 2] + 1);
                }

        }
}//AC出たら泣いて喜ぶよ