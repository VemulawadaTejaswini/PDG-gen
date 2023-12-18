import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] assignments = new int[m];

        for (int i=0; i<m; i++) {
            assignments[i] = scan.nextInt();
        }
        
        int totalDays = 0;
        for (int assignment : assignments) {
            totalDays = totalDays + assignment;
        }
        
        if (totalDays > n) {
            System.out.println(-1);
        } else {
            System.out.println(n - totalDays);
        }
    }
}