import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        boolean flag = false;

        for(int i = 1; i < 10; ++i) {
            if((n % i == 0) && (n/i < 10)) {
                flag = true;
                break;
            }
            else continue;
        }

        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}