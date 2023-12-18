import static java.lang.System.*;

import java.util.Scanner;

class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            if(n == 0 && x == 0) {
            	break;
            }
            for(int a = 1; a <= n; a++) {
            	for(int b = a + 1; b <= n; b++) {
            		for(int c = b + 1; c <= n; c++) {
            			if(a + b + c == x) {
            				count++;
            			}
            		}
            	}
            }
            out.println(count);
        }
    }
}
