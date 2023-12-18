import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int p[] = new int[n];
        for(int i = 0;i < n;i++) {
            p[i] = stdIn.nextInt();
        }
        int count = 0;
        for(int i = 0;i < n;i++){
            if(p[i] != i+1) {
               count++;             
            }
        }
        if(count >= 3) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}