import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, a, b, c;
    static int A,B,C;
    public static void main(String[] args) {
        while(read()){

        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            solve();
        }
        return true;
    }

    static void solve(){
        if(a != 0 && b != 0 && c!= 0){
            A = a * a;
            B = b * b;
            C = c * c;
            if(A == B + C){
                System.out.println("YES");
            }else if(B == A + C){
                System.out.println("YES");
            }else if(C == A + B){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}