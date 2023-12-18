import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int A[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(A);
        int c = A[2] - A[1];
        c += (A[1] - A[0]) / 2;
        if ((A[1] - A[0]) % 2 != 0){
            c += 2;
        }

        System.out.println(c);
    }
}