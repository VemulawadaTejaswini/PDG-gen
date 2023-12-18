import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        String S = "";
        if(N == 0)  S = "0";
        while(Math.abs(N) > 0){
            if(N%2 == 0){
                S = "0"+S;
                N /= -2;
            }else{
                S = "1"+S;
                N = (N-1)/(-2);
            }
        }
        System.out.println(S);
    }
}