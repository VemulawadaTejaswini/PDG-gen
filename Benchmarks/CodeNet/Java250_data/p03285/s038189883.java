import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        for(int i = 0;i <= 25; i ++){
            for(int j = 0; j <= 14; j++){
                if(4 * i + 7 * j == N){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}