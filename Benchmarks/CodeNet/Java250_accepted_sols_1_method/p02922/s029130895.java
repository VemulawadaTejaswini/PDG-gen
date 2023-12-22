import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = 1;
        int i = 0;

        while(C < B) {
            C = C + A - 1;
            i++;
        }
        System.out.println(i);
    }
}