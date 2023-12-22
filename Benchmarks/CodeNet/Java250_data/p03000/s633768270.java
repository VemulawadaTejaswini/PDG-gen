import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int x  = sc.nextInt();

        int[] l = new int[n];

        for(int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }

        int res = 1;
        int pos = 0;
        for(int i=0; i<n; i++) {
            pos += l[i];
            if(pos<=x) res++;
        }

        System.out.println(res);

    }


}
