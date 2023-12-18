import java.util.*;

class Main{
    public static void main(String[] args){
        int N, A, B, X = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        for(int a = 0; a <= 1; a++){
            for(int b = 0; b <= 9; b++){
                for(int c = 0; c <= 9; c++){
                    for(int d = 0; d <= 9; d++){
                        for(int e = 0; e <= 9; e++){
                            if(A <= a+b+c+d+e && a+b+c+d+e <= B && 10000*a+1000*b+100*c+10*d+e <= N){
                                X = X + 10000*a+1000*b+100*c+10*d+e;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(X);
    }
}