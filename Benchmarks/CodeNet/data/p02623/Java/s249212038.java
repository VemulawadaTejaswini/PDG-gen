import java.util.Scanner;

/**
 * atcoder2
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int N[] = new int[n];
        int M[] = new int[m];
        for(int i=0; i<N.length; i++){
            N[i] = sc.nextInt();
        }
        for(int i=0; i<M.length; i++){
            M[i] = sc.nextInt();
        }
        for(int i=0; i<N.length; i++){
            k-=N[i];
            if(k>=0) count++;
            else {
                k+=N[i];
                break;
            }
        }
        for(int i=0; i<M.length; i++){
            k-=M[i];
            if (k>=0) {
                count++;
            } else break;
        }
        System.out.println(count);
    }
    
}