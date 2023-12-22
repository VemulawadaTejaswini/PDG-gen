
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B =  sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int watasu=0;
            if(i %2 ==0){
                if(A%2==0){
                    watasu = A/2;
                }else{
                    A--;
                    watasu = A/2;
                }
                A -= watasu;
                B += watasu;
            }else{
                if(B%2==0){
                    watasu = B/2;
                }else{
                    B--;
                    watasu = B/2;
                }
                watasu = B/2;
                A += watasu;
                B -= watasu;
            }

        }

        System.out.println(A +" "+B );

    }
}
