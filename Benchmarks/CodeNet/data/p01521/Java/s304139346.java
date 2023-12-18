    import java.util.Scanner;
     
    public class Main {
     
    static Scanner sc = new Scanner(System.in);
    static String str;
     
    static boolean solve() {
    int change = 0;
    for (int i = 0; i < str.length() - 1; ++i) {
    if (str.charAt(i) != str.charAt(i + 1)) ++change;
    }
    if (str.charAt(0) == 'o' && str.charAt(str.length() - 1) == 'o') {
    ++change;
    }
    return change % 2 != 0;
    }
     
    public static void main(String[] args) {
    str = sc.next();
    System.out.println(solve() ? 'o' : 'x');
    }
    }