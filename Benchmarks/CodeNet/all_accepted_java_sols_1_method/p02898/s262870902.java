
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int h[] = new int[N];

        for(int i = 0; i  < N; i++){
          h[i] = sc.nextInt();
        }

        int n = 0;

        for(int i = 0; i  < N; i++){
            if(h[i] >= K){
                n++;
            }
          }
        System.out.println(n);



    }
}





