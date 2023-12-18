import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int ans = 0;
        int sum = 1;
        while(true){
            if(sum >= b) break;
            sum--;
            sum += a;
            ans++;
        }
        System.out.println(ans);
    }
}