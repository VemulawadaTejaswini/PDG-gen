import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int height[] = new int[n];
        for(int i = 0; i < n; i++){
            int h = scan.nextInt();
            height[i] = h;
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(height[i] >= k){
                count += 1;
            }
        }
        System.out.println(count);
    }
}