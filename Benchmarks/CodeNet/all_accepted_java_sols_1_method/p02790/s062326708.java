import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0 ; i < B; i++)
            sb1.append(A);
        String a = sb1.toString();
        sb1 = new StringBuilder();
        for (int i = 0 ; i < A; i++)
            sb1.append(B);
        String b = sb1.toString();
        int compare = a.compareTo(b);
        if (compare > 0){
            System.out.println(b);
        } else {
            System.out.println(a);
        }
        sc.close();
    }
}
