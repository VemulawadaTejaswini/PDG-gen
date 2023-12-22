import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = -1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i*j==N) a = i*j;
            }
        }
        if(a==-1) System.out.println("No");
        else System.out.println("Yes");
    }
}
