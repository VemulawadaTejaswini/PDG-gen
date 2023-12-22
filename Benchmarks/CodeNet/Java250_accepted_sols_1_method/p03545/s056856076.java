import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = N % 10;
        N /= 10;
        int C = N % 10;
        N /= 10;
        int B = N % 10;
        N /= 10;
        int A = N % 10;
        sc.close();

        if(A+B+C+D == 7){
            System.out.println(A + "+" + B + "+" + C + "+" + D + "=7");
            return;
        }
        if(A-B+C+D == 7){
            System.out.println(A + "-" + B + "+" + C + "+" + D + "=7");
            return;
        }
        if(A+B-C+D == 7){
            System.out.println(A + "+" + B + "-" + C + "+" + D + "=7");
            return;
        }
        if(A+B+C-D == 7){
            System.out.println(A + "+" + B + "+" + C + "-" + D + "=7");
            return;
        }
        if(A-B-C+D == 7){
            System.out.println(A + "-" + B + "-" + C + "+" + D + "=7");
            return;
        }
        if(A-B+C-D == 7){
            System.out.println(A + "-" + B + "+" + C + "-" + D + "=7");
            return;
        }
        if(A+B-C-D == 7){
            System.out.println(A + "+" + B + "-" + C + "-" + D + "=7");
            return;
        }
        if(A-B-C-D == 7){
            System.out.println(A + "-" + B + "-" + C + "-" + D + "=7");
            return;
        }
    }
}