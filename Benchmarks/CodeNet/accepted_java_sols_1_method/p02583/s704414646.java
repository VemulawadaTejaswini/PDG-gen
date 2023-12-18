import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();

        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(l[i] == l[j]) continue;
                for(int k=j; k<n; k++) {
                    if((l[i] != l[k] && l[j] != l[k]) &&
                        l[i] < l[j] + l[k] && l[j] < l[i] + l[k] && l[k] < l[i] + l[j]) {
                        cnt++;
                        //System.out.println("i: " + l[i] + " j: " + l[j] + " k: " + l[k]);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
