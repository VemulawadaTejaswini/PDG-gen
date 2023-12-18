import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int a = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            a = scan.nextInt();
            if(a >= k){count++;}
        }
        System.out.println(count);
    }
}