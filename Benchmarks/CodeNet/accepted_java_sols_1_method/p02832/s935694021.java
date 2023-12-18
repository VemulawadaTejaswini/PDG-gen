import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int next = 1;
        int result = 0;
        for(int i = 0; i < N; i++){
            int R = sc.nextInt();
            if(R == next){
                next++;
            }else{
                result++;
            }
        }
        System.out.println(result == N ? -1 : result);
    }
}

