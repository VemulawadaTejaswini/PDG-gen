
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t[] = new int[10];
        
        for(int i=0; i<10; i++){
            t[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (t[j] < t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(t[i]);
        }
    }
}

