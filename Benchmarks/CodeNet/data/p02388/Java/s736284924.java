import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = Cube(x);
        System.out.println(ans);
    }

    static int Cube(int a){
        return a*a*a;
    }
}

