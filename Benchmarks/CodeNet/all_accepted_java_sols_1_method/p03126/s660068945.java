import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];

        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            for(int j=0; j<k; j++) {
                c[sc.nextInt()-1]++;
            }
        }
        int res = 0;
        for(int i=0; i<m; i++) {
            if(c[i]==n) res++;
        }
        System.out.println(res);
    }

}
