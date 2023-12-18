import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
 
        Arrays.sort(a);
        int count = 0;
        boolean swich = true;
        for (int i = 0; i < N; i++) {
            if (x >= a[i]) {
                x -= a[i];
                count++;
            } else {
                swich = false;
                break;
            }
        }
        if (swich && x > 0){
            count--;
        } 
        
 
        System.out.println(count);
    }
}