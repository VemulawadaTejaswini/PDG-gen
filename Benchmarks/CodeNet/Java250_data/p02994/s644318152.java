import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int min = Math.abs(l);
        int sub = l;
        for(int i = 2; i <= n; i++){
            if(Math.abs(l + i - 1) < min){
                min = Math.abs(l + i - 1);
                sub = l + i - 1;
            }
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += l + i - 1;
        }
        System.out.println(sum - sub);
    }
}