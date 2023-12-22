import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int N = str.length();
        String sub1 = str.substring(0,N/2);
        String sub2 = str.substring(((N+3)/2) -1  , N);
        System.out.println(sub1.equals(sub2)  ? "Yes" : "No");
    }
}
