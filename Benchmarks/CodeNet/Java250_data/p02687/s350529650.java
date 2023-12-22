import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        System.out.println(S.equals("ABC") ? "ARC" : "ABC");
    }
}