import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[k];
        boolean[] canGet = new boolean[n];
        for(int i = 0;i < k;i++) {
            d[i] = sc.nextInt();
            for(int j = 0;j < d[i];j++) {
                canGet[sc.nextInt() - 1] = true;
            }
        }
        
        int count = 0;
        for(int i = 0;i < canGet.length;i++) {
            if(!canGet[i]) count++;
        }
        System.out.println(count);
    }
}
