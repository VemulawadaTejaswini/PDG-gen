import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, q;
        int i, l, r, p, conut;
        int[] A, m;

        n = sc.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        q = sc.nextInt();
        m = new int[q];
        for (i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        conut = 0;

        for(i=0;i<q;++i){

            r = n/2;
            l = 0;
            p = n;

            while(true){
                
                if(m[i] == A[r]){
                    conut++;
                    break;
                }else if(l == p || p-l == 1){
                    break;
                }else if(m[i] > A[r]){
                    l = r;
                    r = p - (p-l)/2;
                }else{
                    p = r;
                    r = p - (p-l)/2;
                }

            }

        }
        System.out.println(conut);
    }
}

