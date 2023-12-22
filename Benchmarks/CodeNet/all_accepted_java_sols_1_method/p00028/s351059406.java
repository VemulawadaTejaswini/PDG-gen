import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counter = new int[100];
        int maxCnt = 0;
        
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }
        
        while (scanner.hasNext()) {
            int n = scanner.nextInt() - 1;
            counter[n]++;
            if (counter[n] > maxCnt) {
                maxCnt = counter[n];
            } 
        }
        
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == maxCnt) {
                System.out.println(i+1);
            }
        }
    }
}