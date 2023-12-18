import java.util.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] H = new int[N];

        for(int i=0;i<N;i++){
            H[i]=sc.nextInt()-1;
        }

        for(int i=0;i<N-1;i++){
            if(H[i]>H[i+1]){
                H[i+1]++;
                if(H[i]>H[i+1]){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}