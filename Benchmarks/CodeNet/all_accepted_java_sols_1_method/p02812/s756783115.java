import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        String buf = line2.replace("ABC","");
        int result = (line2.length() - buf.length()) / 3;
        
        System.out.println(result);
    }
}
