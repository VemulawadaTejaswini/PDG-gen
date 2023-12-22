import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int N = input.nextInt();
        int Y = input.nextInt();
        int a = -1;
        int b = -1;
        int c = -1;
        boolean flag = false;
        for (int i = 0; i < N+1; i++){
            if (flag){
                break;
            }
            for (int j = 0; j < N+1-i; j++){
                if (i*10000 + j*5000 + (N-i-j)*1000 == Y && (N-i-j) >= 0){
                    a = i;
                    b = j;
                    c = N-i-j;
                    flag = true;
                    break;
                }
            }
        }
        System.out.printf("%d %d %d %n",a,b,c);

    }
}