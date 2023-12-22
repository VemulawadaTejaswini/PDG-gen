import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int therd = scanner.nextInt();
        int[] words = {first, second, therd}; 
        String answer = "NO";
        
        int word = 0;
        int fCount = 0;
        int sCount = 0;
                
        for (int w :words) {
            if (w == 5) fCount++;
            if (w == 7) sCount++;
        }
        if(fCount == 2 && sCount == 1) answer = "YES";
        
        System.out.println(answer);
    }
}
