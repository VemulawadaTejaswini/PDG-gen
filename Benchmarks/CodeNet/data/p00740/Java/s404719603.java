
import java.util.Scanner;

class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            if (n ==0 && p ==0) {
                System.exit(0);
            }
            int[] candidates = new int[n];
            int rocks = p;

            OUT:  while (true) {
                for (int i = 0; i < n; i++){
                    if (rocks == 0) {
                        rocks = candidates[i];
                        candidates[i] = 0;
                    }
                    else {
                        --rocks;
                        ++candidates[i];
                        if (candidates[i] == p){
                            System.out.println(i);
                            break OUT;
                        }
                    }
                }
            }
        }
    }


}

