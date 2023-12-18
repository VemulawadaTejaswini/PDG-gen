import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = N*A;
        
        if(ans <= B){
            System.out.println(ans);
        }else{
            System.out.println(B);
        }
        //System.out.println(ans);
    }
}