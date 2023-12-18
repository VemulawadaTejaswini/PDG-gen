import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int max = X*4;
        int min = X*2;

        System.out.println(Y%2 == 0 && min<=Y && Y<=max ? "Yes" : "No");
    }
}
