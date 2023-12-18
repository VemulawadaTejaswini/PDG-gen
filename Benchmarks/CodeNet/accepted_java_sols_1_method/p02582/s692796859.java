import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        if(str.charAt(0) == 'R' && str.charAt(1) == 'R' && str.charAt(2) == 'R') count = 3;
        else if(str.charAt(0) == 'R' && str.charAt(1) == 'R') count = 2;
        else if(str.charAt(1) == 'R' && str.charAt(2) == 'R') count = 2;
        else if(str.charAt(0) == 'R' || str.charAt(1) == 'R' || str.charAt(2) == 'R') count = 1;

        System.out.println(count);
    }
}
