import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int red =0;
        for(char x: S.toCharArray()){
            if ('R' == x)
                red++;
        }
        if (red * 2> N)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
