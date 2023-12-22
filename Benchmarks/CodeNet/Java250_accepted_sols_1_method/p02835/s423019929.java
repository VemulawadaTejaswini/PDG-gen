import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int A[] = new int[3];
        for (int i=0; i<3; i++) {
            A[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        int sum = Arrays.stream(A).sum();
        if (sum>21)
            System.out.println("bust");
        else
            System.out.println("win");
    }
}