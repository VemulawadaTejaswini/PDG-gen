import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N-1];
        for (int i = 0; i < (N-1); i++) {
            A[i]=sc.nextInt();
        }
        int[] numBuka=new int[N];
        for (int i = 0; i < (N-1); i++) {
            numBuka[A[i]-1]++;
        }
        for (int n : numBuka) {
            System.out.println(n);
        }
        sc.close();
    }
}