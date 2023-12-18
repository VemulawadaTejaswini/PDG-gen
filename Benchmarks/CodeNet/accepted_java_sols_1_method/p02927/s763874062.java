import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int M = stdIn.nextInt();
        int D = stdIn.nextInt();
        int answer = 0;
        for(int j = 1; j <= M; j++){
            for(int i = 22; i <= D; i++){
                int[] a = new int[2];
                a[0] = i/10;
                a[1] = i%10;
                if( a[0] >= 2 && a[1] >= 2){
                    if(a[0] * a[1] == j) answer++;
                }
            }
        }
        System.out.println(answer);
    }
}