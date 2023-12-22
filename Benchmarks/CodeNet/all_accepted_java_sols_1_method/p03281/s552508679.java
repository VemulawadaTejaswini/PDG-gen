import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int answer = 0;
        int i = 1;
        while(i <= n){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 8){
                answer++;
            }
            count = 0;
            i = i+2;
        }
        System.out.print(answer);
    }
}