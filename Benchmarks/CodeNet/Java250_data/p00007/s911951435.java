import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 100000;
        for(int i = 0; i < n; i++){
            ans = (int)Math.ceil(ans * 1.05 / 1000) * 1000;
        }
        System.out.println(ans);
    }
}