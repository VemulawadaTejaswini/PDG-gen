import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean flag = true;

        if((1 <= A && A <= 9) && (1 <= B && B <= 9)) {
            System.out.println(A * B);
        } else {
            System.out.println(-1);
        }
        
    }
}