import java.util.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long ans = 0;
        for(int i=N;i>0;i--){
            if(Math.floor(Math.log10(i))%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}