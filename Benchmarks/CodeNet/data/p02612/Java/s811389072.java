import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 1000 == 0) System.out.println(0);
        else System.out.println(1000 - n % 1000);
        in.close();
    }
}