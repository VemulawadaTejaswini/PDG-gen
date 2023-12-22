

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        while(n>0) {
            int val = n%10;
            if(val == 7) {
                System.out.println("Yes");
                found = true;
                break;
            }
            n = n/10;
        }
        if(!found) {
            System.out.println("No");
        }
    }
}
