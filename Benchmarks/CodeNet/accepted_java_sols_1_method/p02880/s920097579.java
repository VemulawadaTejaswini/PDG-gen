import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        
        boolean ans = false;
        for(int i = 1; i <= 9; i++)
            for(int j = 1; j <= 9; j++)
                if(i * j == N) ans = true;
            
        System.out.println(ans ? "Yes" : "No");

        cin.close();
    }
}