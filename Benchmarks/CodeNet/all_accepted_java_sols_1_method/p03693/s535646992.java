import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        if((100*r + 10*g + b) % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}