import java.util.*;


class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int keta = 1;
        while(N >= K){
            
            N = N/K;
            keta++;

        }
        System.out.println(keta);
    }
}