import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = x / 100;
        int ans;
        if(n*111 >= x){
            ans = n*111;
        }else {
            ans = (n+1)*111;
        }
        System.out.println(ans);
    }
}
