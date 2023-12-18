import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long answer = 0;
        if(a % 2 == 0){
            answer = a;
        }else{
            answer = a*2;
        }
        System.out.println(answer);

    }
}