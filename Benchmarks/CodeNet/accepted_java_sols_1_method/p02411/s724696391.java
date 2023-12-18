import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int sum = m + f;
            char grade; 
            if(m == -1 && f == -1) break;
            else if(m == -1 || f == -1) grade = 'F';
            else if(sum >= 80) grade = 'A';
            else if(sum < 80 && sum >= 65) grade = 'B';
            else if(sum < 65 && sum >= 50) grade = 'C';
            else if(sum < 50 && sum >= 30) {
                if(r >= 50) grade = 'C';
                else grade = 'D';
            }
            else grade = 'F';
            System.out.println(grade);
        }
    }
}
