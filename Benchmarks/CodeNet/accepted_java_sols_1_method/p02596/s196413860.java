import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int K = stdIn.nextInt();

        if(K%2 == 0){
            System.out.println(-1);
            return;
        }

        int offset = 0;
        int rest = 7;
        while(rest < K){
            rest *= 10;
            rest += 7;
            offset++;
        }

        for(int i=0; i<K; i++){
            while(rest >= K){
                rest -= K;
            }

            if(rest == 0){
                System.out.println(i + offset + 1);
                return;
            }

            rest *= 10;
            rest += 7;
        }

        System.out.println(-1);
    }
}