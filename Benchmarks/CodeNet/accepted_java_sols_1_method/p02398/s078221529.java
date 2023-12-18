import java.util.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = 0;
        for(; a <= b; a++) {
            if((c % a) == 0) k++;
        }
        System.out.println(k);
    }
}