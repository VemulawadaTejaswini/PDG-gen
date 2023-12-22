import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans;
        if(B<A){
            ans = A + A - 1;
        }
        else if(A < B){
            ans = B + B - 1;
        }
        else{
            ans = 2*A;
        }
        System.out.println(ans);
    }
}