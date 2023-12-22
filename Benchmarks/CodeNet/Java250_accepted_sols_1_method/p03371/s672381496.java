import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int CC = sc.nextInt();
        int C = 2*CC;
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if(C <= A && C <= B){
            ans = 2*Math.max(X, Y)*CC;
        }else if(C <= A && C > B){
            ans += 2*X*CC;
            ans += Math.max(0, Y-X)*B;
        }else if(C > A && C <= B){
            ans += 2*Y*CC;
            ans += Math.max(0, X-Y)*A;
        }else if(C < A+B){
            if(X >= Y){
                ans += 2*Y*CC;
                ans += Math.max(0, X-Y)*A;
            }else{
                ans += 2*X*CC;
                ans += Math.max(0, Y-X)*B;
            }
        }else{
            ans += A*X+B*Y;
        }
        System.out.println(ans);
    }
}