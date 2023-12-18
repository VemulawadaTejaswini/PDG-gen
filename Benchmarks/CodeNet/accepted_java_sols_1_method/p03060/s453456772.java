import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer V[] = new Integer[N];
        for (int i=0; i<N; i++) {
            V[i] = sc.nextInt();
        }
        Integer C[] = new Integer[N];
        for (int i=0; i<N; i++) {
            C[i] = sc.nextInt();
        }
        int kotae = 0;
        for(int i=0; i<N; i++){
            if(V[i]>=C[i]){
                kotae = kotae + (V[i]-C[i]);
            }
        }
        System.out.println(kotae);
    }
}