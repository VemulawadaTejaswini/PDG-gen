import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int A_pensils=0; int B_pensils=0;
        int A_price=0; int B_price=0;
        while(A_pensils<n){
            A_pensils+=a;
            A_price+=b;
        }
        while(B_pensils<n){
            B_pensils+=c;
            B_price+=d;
        }

        if(A_price<=B_price){ System.out.println(A_price); }
        else{ System.out.println(B_price); }
    }
}
