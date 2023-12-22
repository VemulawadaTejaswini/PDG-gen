import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        str = str.replace("1", "2");
        
        str = str.replace("9", "1");
        
        str = str.replace("2", "9");
        
        System.out.println(str);
    }
}
