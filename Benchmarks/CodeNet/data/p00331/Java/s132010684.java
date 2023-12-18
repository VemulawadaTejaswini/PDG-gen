import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt()+sc.nextInt();
        System.out.println(s==0?0:s/Math.abs(s));
    }
}
