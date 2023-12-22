import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long ans = 0;
        for (int i = 1; i < n+1;i++){
            if (i%3 == 0 || i%5 == 0){
                continue;
            } else {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}