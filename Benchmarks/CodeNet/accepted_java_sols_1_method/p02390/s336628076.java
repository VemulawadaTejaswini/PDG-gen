import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt( );
        int s = num % 60;
        int h = (num/60)/60;
        int m = (num/60)%60;
        System.out.println(h+":"+m+":"+s);
    }
}

