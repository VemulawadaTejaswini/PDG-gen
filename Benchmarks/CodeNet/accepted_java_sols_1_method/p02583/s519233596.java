import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long L[] = new long[n];

        //Liを格納していく
        for(int i = 0; i < n; i++){
            L[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    long a = L[i];
                    long b = L[j];
                    long c = L[k];
                    if(a != b && b != c && c != a){
                        if(a + b > c && b + c > a && c + a > b){
                            cnt += 1;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
