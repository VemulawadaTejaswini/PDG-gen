import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 >= n) {
                sum += l[i];
                break;
            } else {
                sum += Math.min(l[i], l[i+1]);
                i++;
            }
        }
        System.out.println(sum);
        
    }
    
}