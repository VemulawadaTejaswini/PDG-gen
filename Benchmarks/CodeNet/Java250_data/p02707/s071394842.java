import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }

    private void run(){
        int N = sc.nextInt();
        int[] A = new int[N];



        for(int i = 0; i < N-1; i++){
            A[sc.nextInt() - 1]++;
        }

        for(int a: A){
            System.out.println(a);
        }
        sc.close();
    }
}