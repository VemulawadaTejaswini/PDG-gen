import java.util.Scanner;

/**
 * Created on 2016/08/21.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long ans = 0;

        int amari = 0;

        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();

            //amari
            int tmp2 = 0;
            if(tmp == 0){
                amari = 0;
            }else{
                tmp2 = tmp + amari;
                if(tmp2%2 == 0){
                    amari = 0;
                }else {
                    amari = 1;
                }
            }

            int add = (tmp2 / 2);

            ans += add;
        }

        System.out.println(ans);
    }
}
