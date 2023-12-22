import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;
 
        for (int i = 0; i < 1000000; i++) {
            if (a%2 == 0 && b%2 == 0 && c%2 == 0) {
                if (a == b && b ==c) {
                    System.out.println("-1");
                    return;
                }
                int tmpA = a;
                int tmpB = b;
                int tmpC = c;

                a = tmpB/2 + tmpC/2;
                b = tmpA/2 + tmpC/2;
                c = tmpA/2 + tmpB/2;
            } else {
                break;
            }
            ans++;      
        }
 
        System.out.println(ans);
 
        sc.close();
 
        }
 
    }