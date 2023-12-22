import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = str.charAt(i);
        }
        Arrays.sort(A);

        if (A[0] == A[1] && A[2] == A[3] && A[0] != A[3]) {
            System.out.println("Yes");
        } else { 
            System.out.println("No");
        }
    }
}