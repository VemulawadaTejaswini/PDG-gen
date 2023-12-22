import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] antenna = new int[N];
        for(int n=0; n<N; n++) antenna[n] = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++){
            if(Math.abs(antenna[i]-antenna[j]) > K){
                System.out.println(":(");
                System.exit(0);
            }
        }
        System.out.println("Yay!");


    }
}
