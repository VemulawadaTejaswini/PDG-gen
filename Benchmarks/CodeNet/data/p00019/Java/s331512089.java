import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 1;

        for(; num > 0; num--){
            answer *= num;
        }
        System.out.println(answer);

    }
}