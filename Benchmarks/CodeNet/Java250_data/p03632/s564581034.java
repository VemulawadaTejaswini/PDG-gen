import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        boolean[] Alice = new boolean[210];
        boolean[] Bob = new boolean[210];
        for(int i=A;i<B;i++) Alice[i] = true;
        for(int i=C;i<D;i++) Bob[i] = true;
        int ans = 0;
        for(int i=0;i<210;i++){
            if(Alice[i]&&Bob[i]) ans++;
        }
        System.out.println(ans);
    }
}
