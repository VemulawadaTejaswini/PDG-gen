import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        int[] L = new int[N];
        int D = 0;
        int count = 0;
        for(int i=0; i<N;i++){
            L[i]=sc.nextInt();
        }
        while(D <= X ){
            if(count == N){
                count++;
                D += X;
            }else{
                D += L[count];
                count++;
            }

        }
        System.out.println(count);
    }
}