import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> array;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            func(sc.next(), sc.next());
        }
    }
    
    public static void func(String s, String v) {
        switch(s) {
            case "insert":
                array.add(v);
                break;
            case "find":
                if (array.contains(v)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                break;
        }
    }
}