import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    // System.out.println(i + " " + j + " " + k);
                    boolean ok = false;
                    int a = array[i];
                    int b = array[j];
                    int c = array[k];
                    
                    if (a+b>c && b+c>a && c+a>b) {
                        if (a == b || b == c || c == a) continue;
                        count++;
                        
                    // System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
