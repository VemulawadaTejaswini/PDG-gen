import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        String s = sc.next().toLowerCase();
        if(n>=3200)System.out.println(s);
        if(n<3200)System.out.println("red");
    }
}
