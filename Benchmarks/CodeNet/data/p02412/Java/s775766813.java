import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,x;
        while (true) {
            int result = 0;
            n = input.nextInt();
            x = input.nextInt();
            if (n == 0 && x == 0){
                break;
            }
            for (int i = 1; i < n+1; i++){
                for (int j = i+1; j < n+1; j++){
                    for (int k = j+1; k < n+1; k++){
                        if (i+j+k == x){
                            result += 1;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
