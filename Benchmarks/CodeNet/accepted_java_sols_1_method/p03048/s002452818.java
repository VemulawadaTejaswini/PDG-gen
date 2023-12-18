import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int ans = 0;

        for(int i=0;i< N / R+1;i++){
            for(int j=0; j < N / G+1;j++){
                if(i*R + j*G > N){
                    break;
                }
                if((N - i*R - j*G) % B == 0){
                    ans++;
                }

            }
        }

        System.out.println(ans);



    }

}
