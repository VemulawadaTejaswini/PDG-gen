import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.println(String.valueOf(x ^ 1));
    scan.close();
}
}
