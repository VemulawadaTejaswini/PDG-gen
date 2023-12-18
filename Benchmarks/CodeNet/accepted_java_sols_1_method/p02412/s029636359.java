import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            if(a == 0 && b == 0) {
                return;
            }
            for(int i = 1; i < a + 1; i++) {
                for(int j = 1; j < a + 1; j++) {
                    if(i == j) {
                        break;
                    }
                    for(int k = 1; k < a + 1; k++) {
                        if(i == k || j == k) {
                            break;
                        }
                        if(i + j + k == b) {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
