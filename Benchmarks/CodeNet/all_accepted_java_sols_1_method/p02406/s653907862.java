import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        for (int i = 1; i < (n+1); i++){
            String tmp = String.valueOf(i);
            if ((i%3 == 0) || (tmp.contains("3"))){
                System.out.printf(" %d",i);
            }
        }
        System.out.printf("\n");
    }
}
