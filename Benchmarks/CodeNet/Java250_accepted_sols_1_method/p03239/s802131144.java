import java.util.*;

public class Main {
    public static void main(String args[]){
        int N,T;
        int min = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        T = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            int c = scanner.nextInt();
            int t = scanner.nextInt();
            if(t <= T){
                if(min == 0){
                    min = c;
                }else{
                    if(c < min){
                        min = c;
                    }
                }
            }else{
                count++;
            }
        }
        if(count == N){
            System.out.println("TLE");
        }else{
            System.out.println(min);
        }
    }
}