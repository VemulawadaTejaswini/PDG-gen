import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[m];
        int coutA = 0;
        int coutB = 0;
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            if(a[i] < x){
                coutA++;
            } else {
                coutB++;
            }
        }
        System.out.println(Math.min(coutA, coutB));
    }
}
