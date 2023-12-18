import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(",");
        
        for (String str : line) {
            System.out.print(str + " ");
        }
    }
}
