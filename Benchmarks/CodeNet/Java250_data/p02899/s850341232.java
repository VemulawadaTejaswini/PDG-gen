import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] student = new int[N];
        
        for (int i = 1; i < N+1; i++)
            student[scanner.nextInt()-1] = i;
        for (int i = 0; i < N; i++)
            System.out.print(student[i] + " ");
    }
}