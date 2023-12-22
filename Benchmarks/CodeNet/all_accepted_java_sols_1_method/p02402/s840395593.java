import java.util.*;
 
class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0L;
        for (int i=0; i<n; i++) {
            int temp = sc.nextInt();
            min = Math.min(min, temp);
            max = Math.max(max, temp);
            sum += temp;
        }
        System.out.println(min+" "+max+" "+sum);
         
    }
}
