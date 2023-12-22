import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int m[] = new int[N];
        for(int i=0; i<N; i++){
            m[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int i=0; i<N;i++){
            if(min>m[i]) min = m[i];
            X -= m[i];
        }

        System.out.println(N + X/min);


    }
}