import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        double answer = 0;
        if(n != 100){
            answer = n*Math.pow(100,d);
        } else {
            answer = 101*Math.pow(100,d);
        }
        int answeri = (int)answer;
        System.out.print(answeri);
    }
}