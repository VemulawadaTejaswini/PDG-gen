import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> p = new HashSet<>();

        int X = sc.nextInt();
        int N = sc.nextInt();
        int ans = X;
        for(int i=0;i<N;i++){
            p.add(sc.nextInt());

        }

        for(int i=0; i<=N;i++){

            if(i % 2 == 0){
                ans = ans + i;
            } else {
                ans = ans - i;
            }

            if(p.contains(ans)){

            } else {
                break;
            }
        }

        System.out.println(ans);


    }

}
